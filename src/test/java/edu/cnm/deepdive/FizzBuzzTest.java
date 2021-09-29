package edu.cnm.deepdive;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
  // Define our test values
  static final int[] fizzValues = {3, 6, 21, 9};
  static final int[] buzzValues = {5, 10, 25, 20};
  static final int[] fizzBuzzValues = {0, 15, 135, 90, 1500};
  static final int[] neitherValues = {17, 2, 98, 7, 97};

  @Test
  @DisplayName("Fizz Test Case")
  void getFizzBuzz_fizz() {
    FizzBuzz fizzBuzz = new FizzBuzz(); // Instantiate a test instance of FizzBuzz()

    for (int fizzValue : fizzValues) {
      assertEquals(FizzBuzz.FIZZ, fizzBuzz.getFizzBuzz(fizzValue));
    }
  }

  @Test
  @DisplayName("Buzz test case")
  void getFizzBuzz_buzz() {
    FizzBuzz fizzBuzz = new FizzBuzz(); // Instantiate a test instance of FizzBuzz()

    for (int buzzValue : buzzValues) {
      assertEquals(FizzBuzz.BUZZ, fizzBuzz.getFizzBuzz(buzzValue));
    }
  }

  @Test
  @DisplayName("FizzBuzz test case")
  void getFizzBuzz_fizzbuzz() {
    FizzBuzz fizzBuzz = new FizzBuzz(); // Instantiate a test instance of FizzBuzz()

    for (int fizzBuzzValue : fizzBuzzValues) {
      assertEquals(FizzBuzz.FIZZBUZZ, fizzBuzz.getFizzBuzz(fizzBuzzValue));
    }
  }

  @Test
  @DisplayName("Neither test case")
  void getFizzBuzz_neither() {
    FizzBuzz fizzBuzz = new FizzBuzz(); // Instantiate a test instance of FizzBuzz()

    for (int neitherValue : neitherValues) {
      assertEquals(String.valueOf(neitherValue), fizzBuzz.getFizzBuzz(neitherValue));
    }
  }
}
