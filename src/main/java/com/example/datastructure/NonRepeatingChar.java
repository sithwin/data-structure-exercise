package com.example.datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NonRepeatingChar {
  public static int findFirstNonRepeatingChar(String s) {
    Map<Character, Integer> charFrequency = new HashMap<>();

    // Count the frequency of each character
    for (char c : s.toCharArray()) {
      charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
    }

    // Find the first non-repeating character
    charFrequency.forEach((str, count) -> {
      if (str == 1) {
        System.out.println(count);
      }
    });

    return -1; // No non-repeating character found
  }

  public static void main(String[] args) {
    String s = "atlassian";
    int index = findFirstNonRepeatingChar(s);
    System.out.println("Index of the first non-repeating character: " + index);
  }
}
