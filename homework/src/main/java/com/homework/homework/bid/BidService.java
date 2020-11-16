package com.homework.homework.bid;

import com.homework.homework.util.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidService {
  BidRepository bidRepository;

  @Autowired
  public BidService(BidRepository bidRepository) {
    this.bidRepository = bidRepository;
  }

  public Integer highestBid(long id) {
    return bidRepository.findMaxAmountWhereItem(id);
  }
}
