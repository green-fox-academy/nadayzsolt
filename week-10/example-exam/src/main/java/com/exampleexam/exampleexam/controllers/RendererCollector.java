package com.exampleexam.exampleexam.controllers;

import com.exampleexam.exampleexam.models.Url;
import com.exampleexam.exampleexam.services.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class RendererCollector {
  UrlService urlService;

  @Autowired
  public RendererCollector(UrlService urlService) {
    this.urlService = urlService;
  }

  @GetMapping("/")
  public String renderMainPage(Model model, @RequestParam(required = false) String alias,
                               @RequestParam(required = false) String code,
                               @RequestParam(required = false) String url) {
    String message = "";
    if (alias != null && code != null) {
      if (urlService.checkIfUrlOld(alias)) {
        message =
            "Your alias is already in use!";
        model.addAttribute("existurl", url);
        model.addAttribute("existalias", alias);
      } else {
        message =
            "Your URL is aliased to " + alias + " and Your secret code is " + code + ".";
      }
    }
    model.addAttribute("message", message);
    return "index";
  }

  @PostMapping("/save-link")
  public String createUrlAndAlias(String url, String alias) {
    if (url.equals("") || alias.equals("")) {
      return "redirect:/";
    } else {
      Url actualUrl = urlService.checkNewUrl(url, alias);
      return "redirect:/?alias=" + alias + "&code=" + actualUrl.getCode() + "&url=" + url;
    }
  }

  @ExceptionHandler(ResourceNotFoundException.class)
//  @ResponseStatus(HttpStatus.NOT_FOUND)
// ez nem kell mert ResponseEntity lett
//  a return érték, de ez önmagában is megcsinálná, amit kell
  @ResponseBody
  public ResponseEntity handleResourceNotFoundException(){
    return ResponseEntity.notFound().build();
  }

  @GetMapping("/a/{alias}")
  public String checkAndManageAliasHitCount(@PathVariable String alias) {
    if (urlService.checkAlias(alias) == null) {
      throw new ResourceNotFoundException();
    } else {
      urlService.incrementHitCount(alias);
      return "redirect:https://" + urlService.checkAlias(alias).getPagelink();
    }
  }
}
