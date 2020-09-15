package com.reddit.thereddit.services;

import com.reddit.thereddit.models.Post;
import com.reddit.thereddit.repositories.PostRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
  private PostRepository postRepository;
  private List<Integer> pages;

  @Autowired
  public PostService(PostRepository postRepository, List<Integer> pages) {
    this.postRepository = postRepository;
    this.pages = new ArrayList<Integer>();
  }

  public List<Integer> getListOfPages() {
    long pageAmount = postRepository.count() % 10 == 0 ? postRepository.count() / 10 : (postRepository.count() / 10) + 1;
    pages = new ArrayList<>();
    for (int i = 1; i <= pageAmount; i++) {
      pages.add(i);
    }
    return pages;
  }

  public List<Post> getSortedPostByVotes(Integer pageCounter) {
    pageCounter = pageCounter <= 1 ? 1 : pageCounter;
    int startIndex = (pageCounter - 1) * 10;
    return postRepository.findAllSorted().stream().skip(startIndex).limit(10)
        .collect(Collectors.toList());
  }

  public Post addNewPost(String title, String url) {
    return postRepository.save(new Post(title, url));
  }

  public Post editVotes(long id, String vote) {
    Post actualPost = postRepository.findPostById(id);
    int addition = (vote.equals("+")) ? 1 : (vote.equals("-")) ? -1 : 0;
    actualPost.setVotes(actualPost.getVotes() + addition);
    postRepository.save(actualPost);
    return actualPost;
  }
}