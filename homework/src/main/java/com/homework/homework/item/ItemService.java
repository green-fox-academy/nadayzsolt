package com.homework.homework.item;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
  ItemRepository itemRepository;

  @Autowired
  public ItemService(ItemRepository itemRepository) {
    this.itemRepository = itemRepository;
  }

  public boolean isPhotoUrlValidated(ItemDto itemDto) {
    try {
      new URL(itemDto.getPhotoUrl()).toURI();
    } catch (MalformedURLException | URISyntaxException e) {
      return false;
    }
    return true;
  }

  public boolean arePricesValidated(ItemDto itemDto) {
    if (itemDto.getPurchasePrice() > 0 || itemDto.getStartingPrice() > 0) {
      return true;
    } else {
      return false;
    }
  }
}
