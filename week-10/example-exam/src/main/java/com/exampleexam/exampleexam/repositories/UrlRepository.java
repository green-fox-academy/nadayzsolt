package com.exampleexam.exampleexam.repositories;

import com.exampleexam.exampleexam.models.Url;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlRepository extends CrudRepository <Url, Integer> {
  Url findByPagelink(String pagelink);

  Url findByAlias (String alias);
}
