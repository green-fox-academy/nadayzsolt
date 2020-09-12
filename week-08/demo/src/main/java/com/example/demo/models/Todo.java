package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name="todos")
public class Todo {
  @Id
  @GeneratedValue (strategy = GenerationType.AUTO)
  private long id;
  @Column (name="todo_title ")
  private String title;
  private boolean urgent;
  private boolean done;

  public Todo(String title) {
    this.title = title;
  }
}
