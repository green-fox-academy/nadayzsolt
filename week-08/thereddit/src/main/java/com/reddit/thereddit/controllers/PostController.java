package com.reddit.thereddit.controllers;

import com.reddit.thereddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {
  private PostService postService;

  @Autowired
  public PostController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("/main")
  public String renderPosts(Model model, @RequestParam (required= false) Integer pageCounter) {
    model.addAttribute("posts", postService.getSortedPostByVotes(pageCounter));
    model.addAttribute("pages", postService.getListOfPages());
    return "index";
  }

  @GetMapping("/")
  public String renderLogin() {
    return "login";
  }

  @GetMapping("/submit")
  public String renderSubmitPage() {
    return "submit";
  }

  @PostMapping("/vote/{id}")
  public String setTodoFields(@PathVariable long id, String vote, @RequestParam (required = false) Integer pageCounter) {
    postService.editVotes(id, vote);
    return "redirect:/main?pageCounter=" + pageCounter;
  }

  @PostMapping("/setnew")
  public String submitNewPost(String title, String url) {
    postService.addNewPost(title, url);
    return "redirect:/main?pageCounter=1";
  }
}