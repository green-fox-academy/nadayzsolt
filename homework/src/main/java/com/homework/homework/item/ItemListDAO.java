package com.homework.homework.item;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.SqlResultSetMapping;
import lombok.Getter;
import lombok.NoArgsConstructor;


@SqlResultSetMapping(name = "ScheduleResult",
    classes = {
        @ConstructorResult(targetClass = com.homework.homework.item.ItemSpecificDAO.class,
            columns = {@ColumnResult(name = "name", type = String.class),
                @ColumnResult(name = "photo_url", type = String.class),
                @ColumnResult(name = "lastOfferedBid", type = Integer.class)})})
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
