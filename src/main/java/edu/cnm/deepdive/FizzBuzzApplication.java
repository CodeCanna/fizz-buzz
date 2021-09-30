package edu.cnm.deepdive;

import java.util.EnumSet;

public class FizzBuzzApplication {
  public static void main(String[] args) {
    FizzBuzz fizzBuzz = new FizzBuzz(); // Create new instance of FizzBuzz to use getFizzBuzz()
    for (int i = 0; i <= 100; i++) {
      EnumSet<FizzBuzzValue> v = fizzBuzz.getFizzBuzz(i); // Get our values from our method.
      if (!v.isEmpty()) {
        System.out.println(v);
      } else {
        System.out.println(i);
      }
    }
  }
}
