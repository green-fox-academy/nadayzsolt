package com.homework.homework.item;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.homework.homework.bid.Bid;
import com.homework.homework.user.User;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table (name = "items")
public class Item {

  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private String description;
  private String photoUrl;
  private int startingPrice;
  @JsonIgnore
  private int purchasePrice;

  @JsonIgnoreProperties ("itemsForSaleList")
  @ManyToOne
  private User seller;
  @JsonIgnoreProperties ("item")
  @OneToMany (mappedBy = "item")
  private List<Bid> bidList;
  @JsonIgnoreProperties ("itemsBoughtList")
  @ManyToOne
  private User buyer;

  private boolean sold;

  public Item(String name, String description, String photoUrl, int startingPrice,
              int purchasePrice, User seller) {
    this.name = name;
    this.description = description;
    this.photoUrl = photoUrl;
    this.startingPrice = startingPrice;
    this.purchasePrice = purchasePrice;
    this.seller = seller;
  }
}
