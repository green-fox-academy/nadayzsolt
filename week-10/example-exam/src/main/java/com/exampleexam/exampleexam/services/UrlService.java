package com.exampleexam.exampleexam.services;

import com.exampleexam.exampleexam.models.Url;
import com.exampleexam.exampleexam.repositories.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlService {
  UrlRepository urlRepository;

  @Autowired
  public UrlService(UrlRepository urlRepository) {
    this.urlRepository = urlRepository;
  }

  public Url checkNewUrl(String url, String alias) {
    if (url.equals("") || alias.equals("")) {
      return null;
    } else if (urlRepository.findByAlias(alias) == null) {
      int code = (int) (Math.random() * 9000) + 1000;
      return urlRepository.save(new Url(url, alias, code));
    } else {
      Url actualUrl = urlRepository.findByAlias(alias);
      actualUrl.setUrlOld(true);
      urlRepository.save(actualUrl);
      return actualUrl;
    }
  }

  public boolean checkIfUrlOld(String alias) {
    return urlRepository.findByAlias(alias).isUrlOld();
  }

  public Url checkAlias(String alias) {
    return urlRepository.findByAlias(alias);
  }

  public void incrementHitCount (String alias) {
    Url actualUrl = urlRepository.findByAlias(alias);
    actualUrl.setHitCount(actualUrl.getHitCount()+1);
    urlRepository.save(actualUrl);
  }
}
