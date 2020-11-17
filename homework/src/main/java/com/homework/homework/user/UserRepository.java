package com.homework.homework.user;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
  List<User> findAll();

  @Query(value = "SELECT name FROM users", nativeQuery = true)
  List<String> findAllUserName();

  @Query(value = "SELECT * FROM users WHERE name =:username", nativeQuery = true)
  User findByName(String username);
}
