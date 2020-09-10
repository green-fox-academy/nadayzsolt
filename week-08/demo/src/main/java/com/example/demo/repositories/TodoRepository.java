package com.example.demo.repositories;

import com.example.demo.models.Todo;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findAll();

  Todo deleteById (long Id);

  Todo findTodoById (long Id);

  @Query("SELECT b FROM Todo b ORDER BY b.id ASC")
  List<Todo> findAllSorted();
}
