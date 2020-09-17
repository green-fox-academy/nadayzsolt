package com.greenfox.backendapitest.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;


@RunWith (SpringRunner.class)
@WebMvcTest (GuardianController.class)
public class GuardianControllerTest {

  @Autowired
  private MockMvc mockMvc;
  private GuardianController guardianController;

  @Test
  public void withGivenValidParam_addResponse_returnsExpectedResponseAndOk() throws Exception {
    mockMvc.perform(get("/groot?message=someothermessage")).andExpect(status().isOk()).andExpect(
        (ResultMatcher) jsonPath("$.received").value("someothermessage")).andExpect(
        (ResultMatcher) jsonPath("$.translated").value("I am Groot!"));
  }
  @Test
  public void withoutGivenValidParam_addResponse_returnsExpectedResponseAndBadRequest() throws Exception{
mockMvc.perform(get("/groot")).andExpect(status().isBadRequest()).andExpect(jsonPath("$.error").value("I am Groot!"));

  }
}
