package com.reddit.thereddit.repositories;

import com.reddit.thereddit.models.Post;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepository extends CrudRepository <Post, Long> {
  List<Post> findAll();

  @Query ("SELECT b FROM Post b ORDER BY b.votes DESC")
  List<Post> findAllSorted();

  Post findPostById(long id);

}