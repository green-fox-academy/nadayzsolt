package com.example.demo.repositories;

import com.example.demo.models.Todo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findAll();

  Todo deleteById (long Id);

  Todo findTodoById (long Id);

}
