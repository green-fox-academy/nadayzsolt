package com.reddit.thereddit.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table (name = "posts")
public class Post {

  @Column (name = "post_ids")
  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  long id;
  String title;
  String url;
  int votes;

  public Post(String title, String url) {
    this.title = title;
    this.url = url;
  }
}
