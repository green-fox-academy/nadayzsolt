package com.greenfox.programerfoxclub.services;

import com.greenfox.programerfoxclub.models.Fox;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FoxService {
  public List<Fox> foxes;


  public FoxService() {
    this.foxes = new ArrayList<>();
  }
}
