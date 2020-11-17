package com.homework.homework.item;

import com.homework.homework.bid.BidRepository;
import com.homework.homework.util.InvalidIdException;
import com.homework.homework.util.Response;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
  ItemRepository itemRepository;
  BidRepository bidRepository;

  @Autowired
  public ItemService(ItemRepository itemRepository,
                     BidRepository bidRepository) {
    this.itemRepository = itemRepository;
    this.bidRepository = bidRepository;
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

  public List<ItemListDAO> find20ItemByPages(int pageNr) {
    PageRequest twentyPerPage = PageRequest.of(pageNr, 2);
    List<ItemListDAO> listDAOS = new ArrayList<>();
    for (int i = 0; i < itemRepository.findAllItemNameWhereSoldIsFalse(twentyPerPage).size(); i++) {
      String name = itemRepository.findAllItemNameWhereSoldIsFalse(twentyPerPage).get(i);
      String photoUrl = itemRepository.findAllItemPhotoUrlWhereSoldIsFalse(twentyPerPage).get(i);
      Integer maxBid = itemRepository.findAllItemMaxBidWhereSoldIsFalse(twentyPerPage).get(i);
      listDAOS.add(new ItemListDAO(name, photoUrl, maxBid));
    }
    return listDAOS;
  }

  public boolean itemExistsById(long itemId) {
    return itemRepository.existsById(itemId);
  }

  public boolean itemSellable(long itemId) {
    return itemRepository.findById(itemId).get().isSold();
  }

  public ItemSpecificDAO getSpecificItemById(long itemId) {
    Item item = itemRepository.findById(itemId).orElse(null);
    if (!itemRepository.findById(itemId).isPresent()) {
      return null;
    } else if (!item.isSold()) {
      return new ItemSpecificDAO(item.getName(), item.getDescription(), item.getPhotoUrl(),
          item.getBidList(), item.getSeller().getName());
    } else {
      return new ItemSpecificSoldDAO(item.getName(), item.getDescription(), item.getPhotoUrl(),
          item.getBidList(), item.getSeller().getName(),
          bidRepository.findMaxAmountWhereItem(item.getId()));
    }
  }

  public Optional<Item> findById(long itemId) {
    return itemRepository.findById(itemId);
  }

  public void saveItemChanges(Item item) {
    itemRepository.save(item);
  }
}