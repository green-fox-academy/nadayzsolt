package com.homework.homework.item;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.homework.homework.user.User;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Item {

  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private String description;
  private String photoUrl;
  private int startingPrice;
  private int purchasePrice;
  @JsonIgnoreProperties ("itemList")
  @ManyToOne
  private User user;

  public Item(String name, String description, String photoUrl, int startingPrice,
              int purchasePrice, User user) {
    this.name = name;
    this.description = description;
    this.photoUrl = photoUrl;
    this.startingPrice = startingPrice;
    this.purchasePrice = purchasePrice;
    this.user = user;
  }
}
