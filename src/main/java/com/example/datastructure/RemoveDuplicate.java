package com.example.datastructure;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
  public static void main(String[] args) {
    Integer[] array = {1, 1, 2, 2, 3, 4, 5};
    Set<Integer> uniqueSet = new LinkedHashSet<>(Arrays.asList(array));
    Integer[] uniqueArray = uniqueSet.toArray(new Integer[0]);

    // Printing the unique elements
    for (int num : uniqueArray) {
      System.out.print(num + " ");
    }
  }
}
