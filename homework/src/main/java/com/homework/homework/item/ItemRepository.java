package com.homework.homework.item;

import java.util.List;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends PagingAndSortingRepository<Item, Long> {

@Query (value = "SELECT name, photo_url, MAX(bids.amount) FROM items LEFT JOIN bids ON items.id = bids.item_id WHERE sold = 0 GROUP BY items.id", nativeQuery = true)
List<Object[]> getDaoTuples(PageRequest pageRequest);
}