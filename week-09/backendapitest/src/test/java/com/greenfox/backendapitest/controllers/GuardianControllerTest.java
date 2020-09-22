package com.greenfox.backendapitest.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.greenfox.backendapitest.services.GuardianService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;


@SpringBootTest
@AutoConfigureMockMvc
public class GuardianControllerTest {

  @Autowired
  private MockMvc mockMvc;
  private GuardianService guardianService

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
  public void givenInvalidParam_whenCallYondu_thanReturnBadRequest() throws Exception {
    mockMvc.perform(get("/yondu")).andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error").value("Bad request! Provide valid distance & time!"));
  }

  @Test
  public void givenValidParam_whenFullfillRocket_thanReturnOk() throws Exception {
    mockMvc.perform(get("/rocket/fill?caliber=.50&amount=12500"))
        .andExpect(status().isOk())
        .andExpect((ResultMatcher) jsonPath("$.received").value(".50"))
        .andExpect((ResultMatcher) jsonPath("$.amount").value(12500))
        .andExpect((ResultMatcher) jsonPath("$.shipStatus").value("full"))
        .andExpect((ResultMatcher) jsonPath("$.ready").value("true"));
  }

  @Test
  public void givenValidParam_whenFillZeroToRocket_thanReturnOk() throws Exception {
    mockMvc.perform(get("/rocket/fill?caliber=.50&amount=0"))
        .andExpect(status().isOk())
        .andExpect((ResultMatcher) jsonPath("$.received").value(".50"))
        .andExpect((ResultMatcher) jsonPath("$.amount").value(0))
        .andExpect((ResultMatcher) jsonPath("$.shipStatus").value("empty"))
        .andExpect((ResultMatcher) jsonPath("$.ready").value("false"));
  }
// Ez már failed, hogyha a classban lévő összes tesztet egyszerre indítom,
// de nem tudok @BeforeEach clearelni, mivel nem reporol van szo. (a 2vel efölötti miatt)
  @Test
  public void givenValidParam_whenCallRocket_thanReturnOk() throws Exception {
    mockMvc.perform(get("/rocket/fill?caliber=.50&amount=5000"))
        .andExpect(status().isOk())
        .andExpect((ResultMatcher) jsonPath("$.received").value(".50"))
        .andExpect((ResultMatcher) jsonPath("$.amount").value(5000))
        .andExpect((ResultMatcher) jsonPath("$.shipStatus").value("40.0%"))
        .andExpect((ResultMatcher) jsonPath("$.ready").value("false"));
  }
}
