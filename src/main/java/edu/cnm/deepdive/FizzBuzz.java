package edu.cnm.deepdive;

/**
 *Computes and returns a {@link String} of Fizz, Buzz, FizzBuzz, or the {@link String} representation of the value.
 */
public class FizzBuzz {
  static final String FIZZ = "Fizz";
  static final String BUZZ = "Buzz";
  static final String FIZZBUZZ = "Fizz Buzz";
/*
  public static void main(String[] args) {
//    System.out.println(getFizzBuzz(15));
    for (int i = 1; i < 100; i++) {
      System.out.println(getFizzBuzz(i));
    }
  }
*/

  /**
   * Takes an {@link int} and returns Fizz, Buzz, FizzBuzz, or the string form of the value itself.
   * @param value The value we are checking for FizzBuzz.
   * @return The returned {@link String} containing Fizz, Buzz, FizzBuzz, or String.valueof().
   */
  public String getFizzBuzz(int value) {
    String text;

    if ((value % 3) == 0 && (value % 5) != 0) {        // Check if divisible by 3 and NOT 5
//      text = "Fizz";
      text = FIZZ;
    } else if ((value % 5) == 0 && (value % 3) != 0) { // Check if divisible by 5 and NOT 3
//      text = "Buzz";
      text = BUZZ;
    } else if ((value % 3) == 0 && (value % 5) == 0) { // Check if divisible by 3 AND 5
      text = FIZZBUZZ;
    } else {                                           // Check if NOT divisible by either (Only option left really...)
      text = String.valueOf(value);
    }

    // Return our value as a string
    return text;
  }
}
