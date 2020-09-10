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
  public String renderTodos(Model model) {
    model.addAttribute("todolist",  todoRepository.findAllSorted());
    return "todolist";
  }

  @PostMapping("/list")
  public String addTodo(String todoname) {
    todoRepository.save(new Todo(todoname));
    return "redirect:/list";
  }

  @PostMapping("/del/{id}")
  public String delTodo(@PathVariable long id) {
    todoRepository.deleteById(id);
    return "redirect:/list";
  }

  @PostMapping("/edit/{id}")
  public String setTodoFields(@PathVariable long id, boolean urgent, boolean done, String title) {
    Todo actualTodo = todoRepository.findTodoById(id);
    String previousTitle = actualTodo.getTitle();
    actualTodo.setDone(done);
    actualTodo.setUrgent(urgent);
    if (!title.equals("")) {
      actualTodo.setTitle(title);
    } else {
      actualTodo.setTitle(previousTitle);
    }
    todoRepository.save(actualTodo);
    return "redirect:/list";
  }
}
