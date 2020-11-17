package com.homework.homework.item;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ItemListDAO {
  private String name;
  private String photoUrl;
  private Integer lastOfferedBid;

  public ItemListDAO(String name, String photoUrl, Integer lastOfferedBid) {
    this.name = name;
    this.photoUrl = photoUrl;
    this.lastOfferedBid = lastOfferedBid;
  }
}
