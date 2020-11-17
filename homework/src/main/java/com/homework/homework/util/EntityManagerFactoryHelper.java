package com.homework.homework.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryHelper {
  EntityManagerFactory emf = Persistence.createEntityManagerFactory(null);
}

