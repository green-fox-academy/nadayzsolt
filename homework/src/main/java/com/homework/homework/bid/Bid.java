package com.homework.homework.bid;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.homework.homework.item.Item;
import com.homework.homework.user.User;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "bids")
public class Bid {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private int amount;
  @JsonIgnoreProperties("bidList")
  @ManyToOne
  private User bidder;
  @JsonIgnoreProperties("bidList")
  @ManyToOne
  private Item item;

  public Bid(int amount, User bidder, Item item) {
    this.amount = amount;
    this.bidder = bidder;
    this.item = item;
  }
}
