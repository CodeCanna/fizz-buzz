package edu.cnm.deepdive;

import java.util.EnumSet;
import edu.cnm.deepdive.FizzBuzzValue;

/**
 *Computes and returns a {@link String} of Fizz, Buzz, FizzBuzz, or the {@link String} representation of the value.
 */
public class FizzBuzz {
  static final String FIZZ = "Fizz";
  static final String BUZZ = "Buzz";
  static final String FIZZBUZZ = "Fizz Buzz";

  /**
   * Takes an {@link int} and returns Fizz, Buzz, FizzBuzz, or the string form of the value itself.
   * @param value The value we are checking for FizzBuzz.
   * @return The returned {@link String} containing Fizz, Buzz, FizzBuzz, or String.valueof().
   */
  public EnumSet<FizzBuzzValue> getFizzBuzz(int value) {
    EnumSet<FizzBuzzValue> set = EnumSet.noneOf(FizzBuzzValue.class); // TODO: Get clarification on this line
    if ((value % 3) == 0 && (value % 5) != 0) {        // Check if divisible by 3 and NOT 5
      set.add(FizzBuzzValue.FIZZ);
    } else if ((value % 5) == 0 && (value % 3) != 0) { // Check if divisible by 5 and NOT 3
      set.add(FizzBuzzValue.BUZZ);
    } else if ((value % 3) == 0 && (value % 5) == 0) { // Check if divisible by 3 AND 5
      set.add(FizzBuzzValue.FIZZ);
      set.add(FizzBuzzValue.BUZZ);
    }

    // Return our value as a string
    return set;
  }
}
