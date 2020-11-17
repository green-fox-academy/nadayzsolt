package com.homework.homework.item;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Transient;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NamedNativeQuery(
    name = "itemlistdao",
    query = "SELECT name, photo_url, MAX(bids.amount) FROM items LEFT JOIN bids ON items.id = bids.item_id WHERE sold = 0 GROUP BY items.id",
    resultClass = ItemListDAO.class, resultSetMapping = "itemlistdao"
)
@SqlResultSetMapping(name = "ItemListDAO",
    classes = {
        @ConstructorResult(targetClass = com.homework.homework.item.ItemSpecificDAO.class,
            columns = {@ColumnResult(name = "name", type = String.class),
                @ColumnResult(name = "photo_url", type = String.class),
                @ColumnResult(name = "lastOfferedBid", type = Integer.class)})})
@NoArgsConstructor
@Getter
public class ItemListDAO {
  private String name;
  private String photoUrl;
  private Integer lastOfferedBid;

  public ItemListDAO(String name, String photoUrl, Integer lastOfferedBid) {
    this.name = name;
    this.photoUrl = photoUrl;
    this.lastOfferedBid = lastOfferedBid;
  }
}
