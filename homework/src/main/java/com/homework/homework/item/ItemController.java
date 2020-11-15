package com.homework.homework.item;

import com.homework.homework.user.User;
import com.homework.homework.user.UserService;
import com.homework.homework.util.JwtTokenMissingException;
import com.homework.homework.util.JwtTokenUtil;
import com.homework.homework.util.Response;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
  ItemService itemService;
  UserService userService;
  JwtTokenUtil jwtTokenUtil;
  private Integer pageNr;
  private HttpServletRequest request;

  @Autowired
  public ItemController(ItemService itemService, UserService userService,
                        JwtTokenUtil jwtTokenUtil) {
    this.itemService = itemService;
    this.userService = userService;
    this.jwtTokenUtil = jwtTokenUtil;
  }

  @PostMapping("/newitem")
  public ResponseEntity<?> newItem(HttpServletRequest request, @RequestBody ItemDto itemDto) {
    if (request.getHeader("Home-token") == null) {
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new Response("Missing JWT token"));
    } else if (userService.findById(jwtTokenUtil.getIdFromRequest(request)) == null) {
      throw new JwtTokenMissingException("Invalid user/token");
    } else if (itemDto.getName() == null || itemDto.getName().equals("")) {
      return ResponseEntity.status(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
          .body(new Response("Missing item-name!"));
    } else if (itemDto.getDescription() == null ||
        itemDto.getDescription().equals("")) {
      return ResponseEntity.status(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
          .body(new Response("Missing item-description!"));
    } else if (itemDto.getPhotoUrl() == null || itemDto.getPhotoUrl().equals("")) {
      return ResponseEntity.status(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
          .body(new Response("Missing photo-URL!"));
    } else if (itemDto.getStartingPrice() == 0) {
      return ResponseEntity.status(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
          .body(new Response("Missing starting price!"));
    } else if (itemDto.getPurchasePrice() == 0) {
      return ResponseEntity.status(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
          .body(new Response("Missing purchase price!"));
    } else if (itemService.isPhotoUrlValidated(itemDto)) {
      return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE)
          .body(new Response("Invalid photo url format!"));
    } else if (!itemService.arePricesValidated(itemDto)) {
      return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE)
          .body(new Response("Invalid price number format!"));
    } else {
      User user = userService.findById(jwtTokenUtil.getIdFromRequest(request));
      Item item = new Item(itemDto.getName(), itemDto.getDescription(), itemDto.getPhotoUrl(),
          itemDto.getStartingPrice(), itemDto.getPurchasePrice(), user);
      itemService.itemRepository.save(item);
      return ResponseEntity.ok(item);
    }
  }

  @GetMapping(value = {"/listitembypage", "/listitembypage/{nr}"})
  public ResponseEntity<?> listTheNth20(@PathVariable(required = false, name = "nr") Integer pageNr,
                                        HttpServletRequest request) {
    if (request.getHeader("Home-token") == null) {
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new Response("Missing JWT token"));
    } else if (pageNr == null) {
      return ResponseEntity.ok(itemService.find20ItemByPages(0));
    } else if (pageNr < 0) {
      return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE)
          .body(new Response("Invalid page number!"));
    } else {
      return ResponseEntity.ok(itemService.find20ItemByPages(pageNr));
    }
  }
}