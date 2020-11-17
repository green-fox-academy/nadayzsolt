package com.homework.homework.item;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ItemCreateDAO {
  private long id;
  private String name;
  private String description;
  private String photoUrl;
  private int startingPrice;
  private int purchasePrice;

  public ItemCreateDAO(long id, String name, String description, String photoUrl, int startingPrice,
                       int purchasePrice) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.photoUrl = photoUrl;
    this.startingPrice = startingPrice;
    this.purchasePrice = purchasePrice;
  }
}
