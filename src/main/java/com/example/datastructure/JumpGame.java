package com.example.datastructure;

public class JumpGame {
  public static boolean canReachLastIndex(int[] nums) {
    int jump = nums[0];
    for (int i = jump; i < nums.length; i++) {
      System.out.println(nums[i]);
      if (nums[i] == 0) return false;

      i += nums[i] - 1;
    }

    return true;
  }

  public static void main(String[] args) {
    int[] nums1 = {2, 3, 1, 1, 4};
    int[] nums2 = {3, 2, 1, 0, 4};

    System.out.println(canReachLastIndex(nums1));  // true
    System.out.println(canReachLastIndex(nums2));  // false
  }
}
