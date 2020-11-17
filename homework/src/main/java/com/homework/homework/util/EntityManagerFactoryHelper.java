package com.homework.homework.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryHelper {

  public static EntityManagerFactory factory;

  private static final String persistenceUnitName = null;

  EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnitName);
}

