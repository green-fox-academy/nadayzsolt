package com.reddit.thereddit.services;

import com.reddit.thereddit.models.Post;
import com.reddit.thereddit.repositories.PostRepository;
import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service
@RequiredArgsConstructor
public class PostService {
  private PostRepository postRepository;

  @Autowired
  public PostService(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public List<Post> getSortedPostByVotes(){
      return postRepository.findAllSorted();
    }

  public Post getActualPost(Long id){
    return postRepository.findPostById(id);
  }

  public Post addNewPost (String title, String url){
    return postRepository.save(new Post(title, url));
  }

  public Post editVotes (long id, String vote){
    Post actualPost = postRepository.findPostById(id);
    int addition = (vote.equals("+")) ? 1 : (vote.equals("-")) ? -1 : 0;
    actualPost.setVotes(actualPost.getVotes() + addition);
    postRepository.save(actualPost);
    return actualPost;
  }
}