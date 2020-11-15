package com.homework.homework.item;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ItemDto {
  private String name;
  private String description;
  private String photoUrl;
  private int startingPrice;
  private int purchasePrice;
}
