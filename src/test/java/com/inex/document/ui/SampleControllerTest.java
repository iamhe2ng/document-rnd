package com.inex.document.ui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@WebMvcTest
@ExtendWith(value = { SpringExtension.class })
class SampleControllerTest {

  @BeforeEach
  void setUp() {

  }

  @Test
  @DisplayName("sample document")
  void sampleDocument() {

  }
}