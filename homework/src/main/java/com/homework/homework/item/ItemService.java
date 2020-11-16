package com.homework.homework.item;

import com.homework.homework.util.InvalidIdException;
import com.homework.homework.util.Response;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
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
    return itemDto.getPurchasePrice() > 0 || itemDto.getStartingPrice() > 0;
  }

  public List<Item> find20ItemByPages(int pageNr) {
    PageRequest twentyPerPage = PageRequest.of(pageNr, 2);
    return itemRepository.findAllBySoldIsFalse(twentyPerPage).getContent();
  }
}