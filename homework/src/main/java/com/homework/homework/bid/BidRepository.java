package com.homework.homework.bid;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BidRepository extends CrudRepository<Bid, Long> {
  List<Bid> findAllByBidder_Id(long id);

  List<Bid> findAllByItem_Id(long id);

  @Query(value = "SELECT MAX(amount) FROM bids WHERE item_id =:id", nativeQuery = true)
  Integer findMaxAmountWhereItem(long id);
}
