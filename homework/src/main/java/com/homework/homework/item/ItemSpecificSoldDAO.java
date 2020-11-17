package com.homework.homework.item;

import com.homework.homework.bid.Bid;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ItemSpecificSoldDAO extends ItemSpecificDAO {
  private Integer buyingPrice;

  public ItemSpecificSoldDAO(String name, String description, String photoUrl,
                             List<Bid> allPlacedBids, String sellerName,
                             Integer buyingPrice) {
    super(name, description, photoUrl, allPlacedBids, sellerName);
    this.buyingPrice = buyingPrice;
  }
}
