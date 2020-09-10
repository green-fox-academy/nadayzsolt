package com.reddit.thereddit.controllers;

import com.reddit.thereddit.models.Post;
import com.reddit.thereddit.services.PostService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Getter
@Setter
@Controller
public class PostController {
  private PostService postService;

  @Autowired
  public PostController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("/")
  public String renderPosts(Model model) {
    model.addAttribute("posts", postService.getSortedPostByVotes());
    return "index";
  }

  @GetMapping("/submit")
  public String renderSubmitPage() {
    return "submit";
  }

  @PostMapping("/vote/{id}")
  public String setTodoFields(@PathVariable long id, String vote) {
    postService.editVotes(id, vote);
    return "redirect:/";
  }

  @PostMapping("/setnew")
  public String submitNewPost(String title, String url) {
    postService.addNewPost(title, url);
    return "redirect:/";
  }
}