package com.homework.homework.bid;

import com.homework.homework.item.Item;
import com.homework.homework.item.ItemService;
import com.homework.homework.user.User;
import com.homework.homework.user.UserService;
import com.homework.homework.util.JwtTokenUtil;
import com.homework.homework.util.Response;
import io.jsonwebtoken.MalformedJwtException;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BidController {
  BidService bidService;
  JwtTokenUtil jwtTokenUtil;
  UserService userService;
  ItemService itemService;

  @Autowired
  public BidController(BidService bidService, JwtTokenUtil jwtTokenUtil,
                       UserService userService, ItemService itemService) {
    this.bidService = bidService;
    this.jwtTokenUtil = jwtTokenUtil;
    this.userService = userService;
    this.itemService = itemService;
  }

  @PostMapping("/bid")
  public ResponseEntity<?> bid(@RequestBody BidDto bidDto, HttpServletRequest request) {
    try {
      if (userService.findById(jwtTokenUtil.getIdFromRequest(request)) == null) {
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new Response("Invalid user/token"));
      }
    } catch (MalformedJwtException | StringIndexOutOfBoundsException | NullPointerException e) {
      return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new Response("Invalid user/token"));
    }
    User user = userService.findById(jwtTokenUtil.getIdFromRequest(request));
    Optional<Item> itemOptional = itemService.findById(bidDto.getItemId());
    Item item = itemOptional.orElse(null);
    if(user.getDollarAmount() < bidDto.getAmount()){
      return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(new Response("Not enough money!"));
    } else if (!itemOptional.isPresent()){
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Response("Item not found!"));
    } else if (item.isSold()){
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Response("Item not sellable!"));
    } else if(bidService.highestBid(bidDto.getItemId()) != null && bidService.highestBid(bidDto.getItemId()) >= bidDto.getAmount()){
      return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(new Response("Bid is too low!"));
    } else if(item.getPurchasePrice() > bidDto.getAmount()){
      bidService.bidRepository.save(new Bid(bidDto.getAmount(), user, item));
      return ResponseEntity.ok(item);
    } else {
      bidService.bidRepository.save(new Bid(bidDto.getAmount(), user, item));
      item.setSold(true);
      item.setBuyer(user);
      itemService.saveItemChanges(item);
      user.setDollarAmount(user.getDollarAmount()-bidDto.getAmount());
      userService.saveUser(user);
      User seller = item.getSeller();
      seller.setDollarAmount(seller.getDollarAmount()+bidDto.getAmount());
      userService.saveUser(seller);
      return ResponseEntity.ok(item);
    }
  }
}
