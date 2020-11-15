package com.homework.homework;

import com.homework.homework.util.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  UserService userService;
  JwtTokenUtil jwtTokenUtil;

  @Autowired
  public UserController(UserService userService, JwtTokenUtil jwtTokenUtil) {
    this.userService = userService;
    this.jwtTokenUtil = jwtTokenUtil;
  }

  @PostMapping("/login")
  ResponseEntity<?> login(@RequestBody UserDTO userDTO) {
    if (userDTO.getName() == null || userDTO.getPassword() == null ||
        userDTO.getName().equals("") || userDTO.getPassword().equals("")) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Response("Bad login data"));
    } else if (!userService.userExists(userDTO.getName())) {
      return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).
          body(new Response("No Such User: " + userDTO.getName()));
    } else if (!userService.userPasswordValid(userDTO)) {
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).
          body(new Response("Invalid password!"));
    } else {
      return ResponseEntity.ok(new Response(jwtTokenUtil.generateToken(userService.findByUserName(userDTO.getName()))));
    }
  }
}