package com.example.datastructure;

import java.util.Arrays;

public class ReverseArray {
  public static void reverse(int[] array) {
    int length = array.length;
    for (int i = 0; i < length / 2; i++) {  // O(N/2) => 0(N)
      // right side
      int rightIndex = array.length - 1 - i;
      int left = array[i];
      array[i] = array[rightIndex];
      array[rightIndex] = left;
    }
    System.out.println(Arrays.toString(array));
  }

  public static void main(String[] args) {
    int[] nums1 = {1, 2, 3, 4, 5, 6};
    reverse(nums1);
  }
}
