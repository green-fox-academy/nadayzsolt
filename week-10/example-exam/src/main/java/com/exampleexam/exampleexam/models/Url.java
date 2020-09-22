package com.exampleexam.exampleexam.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@NoArgsConstructor
public class Url {

  @GeneratedValue (strategy = GenerationType.IDENTITY)
  @Id
  private int id;
  private String pagelink;
  private String alias;
  private int code;
  private boolean urlOld;
  private int hitCount;

  public Url(String pagelink, String alias, int code) {
    this.pagelink = pagelink;
    this.alias = alias;
    this.code = code;
  }
}
