package com.homework.homework.item;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Transient;
import lombok.Getter;
import lombok.NoArgsConstructor;

// ezzel az a baj, hogy sehogy se ismeri fel a nevét, hiába írom be a query után egyből (de a classét sem)
//@SqlResultSetMapping(name = "ItemListDAOresult",
//    classes = {
//        @ConstructorResult(targetClass = com.homework.homework.item.ItemSpecificDAO.class,
//            columns = {@ColumnResult(name = "name", type = String.class),
//                @ColumnResult(name = "photo_url", type = String.class),
//                @ColumnResult(name = "lastOfferedBid", type = Integer.class)})})
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
