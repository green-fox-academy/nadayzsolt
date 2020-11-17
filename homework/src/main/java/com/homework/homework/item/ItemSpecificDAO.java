package com.homework.homework.item;

import com.homework.homework.bid.Bid;
import java.util.List;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ItemSpecificDAO {
  private String name;
  private String description;
  private String photoUrl;
  private List<Bid> allPlacedBids;
  private String sellerName;

  public ItemSpecificDAO(String name, String description, String photoUrl,
                         List<Bid> allPlacedBids, String sellerName) {
    this.name = name;
    this.description = description;
    this.photoUrl = photoUrl;
    this.allPlacedBids = allPlacedBids;
    this.sellerName = sellerName;
  }
}
