package com.homework.homework.item;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends PagingAndSortingRepository<Item, Long> {

  @Query(value = "SELECT name FROM items WHERE sold = 0", nativeQuery = true)
  List<String> findAllItemNameWhereSoldIsFalse(PageRequest pageRequest);

  @Query(value = "SELECT photo_url FROM items WHERE sold = 0", nativeQuery = true)
  List<String> findAllItemPhotoUrlWhereSoldIsFalse(PageRequest pageRequest);

  @Query(value = "SELECT MAX(bids.amount) FROM items LEFT JOIN bids ON items.id = bids.item_id WHERE sold = 0 GROUP BY items.id", nativeQuery = true)
  List<Integer> findAllItemMaxBidWhereSoldIsFalse(PageRequest pageRequest);
}