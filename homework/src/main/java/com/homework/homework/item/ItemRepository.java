package com.homework.homework.item;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends PagingAndSortingRepository<Item, Long> {

  @Query(value = "SELECT * FROM items WHERE sold = 0", nativeQuery = true)
  Page<Item> findAll(PageRequest pageRequest);
}
