package org.example.jenkins_docker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    
  @Test
  public void testInputIsEven() {
    assertTrue(Main.checkInputIsAnEvenNumber(22));
  }
}
