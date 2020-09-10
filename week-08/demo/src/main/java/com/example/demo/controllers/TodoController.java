package com.example.demo.controllers;

import com.example.demo.models.Todo;
import com.example.demo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TodoController {
  private TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @GetMapping({"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todolist", todoRepository.findAll());
    return "todolist";
  }

  @PostMapping ("/list")
  public String addTodo(String todoname){
    todoRepository.save(new Todo(todoname));
    return "redirect:/list";
  }

  @PostMapping ("/del/{id}")
  public String delTodo(@PathVariable long id){
    todoRepository.deleteById(id);
    return "redirect:/list";
  }

  @PostMapping ("/edit/{id}")
  public String setTodoUrgent(@PathVariable long id, boolean urgent, boolean done, String title) {
    Todo actualTodo = todoRepository.findTodoById(id);
    actualTodo.setTitle(title);
    actualTodo.setUrgent(urgent);
    actualTodo.setDone(done);
    todoRepository.save(actualTodo);
    return "redirect:/list";
  }
}
