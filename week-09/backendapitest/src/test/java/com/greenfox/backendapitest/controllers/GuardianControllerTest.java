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


@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void givenValidParam_whenCallGroot_thanReturnOk() throws Exception {
    mockMvc.perform(get("/groot?message=someothermessage"))
        .andExpect(status().isOk())
        .andExpect((ResultMatcher) jsonPath("$.received").value("someothermessage"))
        .andExpect((ResultMatcher) jsonPath("$.translated").value("I am Groot!"));
  }

  @Test
  public void givenInvalidParam_whenCallGroot_thanReturnBadRequest() throws Exception {
    mockMvc.perform(get("/groot")).andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error").value("I am Groot!"));

  }

  @Test
  public void givenValidParam_whenCallYondu_thanReturnOk() throws Exception {
    mockMvc.perform(get("/yondu?distance=10.0&time=2.0")).andExpect(status().isOk()).andExpect(
        (ResultMatcher) jsonPath("$.distance").value(10.0)).andExpect(
        (ResultMatcher) jsonPath("$.time").value(2.0)).andExpect(
        (ResultMatcher) jsonPath("$.speed").value(5.0));
  }

  @Test
  public void notGivenValidParam_whenCallYondu_thanReturnBadRequest() throws Exception {
    mockMvc.perform(get("/yondu")).andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error").value("Bad request! Provide valid distance & time!"));
  }
}
