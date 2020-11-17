package com.homework.homework.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.homework.homework.bid.Bid;
import com.homework.homework.item.Item;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  @JsonIgnore
  private String password;
  @JsonIgnore
  private int dollarAmount;
  @JsonIgnore
  @OneToMany(mappedBy = "seller")
  List<Item> itemsForSaleList;
  @JsonIgnore
  @OneToMany(mappedBy = "bidder")
  List<Bid> bidList;
  @JsonIgnore
  @OneToMany(mappedBy = "buyer")
  List<Item> itemsBoughtList;

  public User(String name, String password) {
    this.name = name;
    this.password = password;
  }
}