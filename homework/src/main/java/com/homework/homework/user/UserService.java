package com.homework.homework.user;

import com.homework.homework.util.JwtTokenMissingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  UserRepository userRepository;

  @Autowired
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public void saveUser(User user) {
    userRepository.save(user);
  }

  public boolean userExists(String name) {
    return userRepository.findAllUserName().contains(name);
  }

  public boolean userPasswordValid(UserDTO userDTO) {
    return userRepository.findByName(userDTO.getName()).getPassword().equals(userDTO.getPassword());
  }

  public User findByUserName(String name) {
    return userRepository.findByName(name);
  }

  public User findById(Long id) {
    try {
      return userRepository.findById(id).orElseThrow(NullPointerException::new);
    } catch (NullPointerException e) {
      throw new JwtTokenMissingException("Missing token");
    }
  }
}