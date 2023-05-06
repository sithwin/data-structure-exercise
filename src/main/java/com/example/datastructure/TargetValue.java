package com.example.datastructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TargetValue {
  public static List<List<Integer>> findPairSum(int[] arr, int target) {
    List<List<Integer>> pairs = new ArrayList<>();

    for(int i = 0; i < arr.length; i++) {
      for(int j = i + 1; j < arr.length; j++) {
        if(arr[i] + arr[j] == target) {
          List<Integer> pair = new ArrayList<>();
          pair.add(arr[i] );
          pair.add(arr[j] );
          pairs.add(pair);
        }
      }
    }
    return pairs;
  }

  public static List<List<Integer>> findPairSum2(int[] arr, int target) {
    List<List<Integer>> pairs = new ArrayList<>();
    Set<Integer> wantedValue = new HashSet<>();

    for(int num: arr) {
      if(wantedValue.contains(num)) {
        List<Integer> pair = new ArrayList<>();
        pair.add(target - num);
        pair.add(num);
        pairs.add(pair);
      }
      wantedValue.add(target - num);
    }
    return pairs;
  }

  public static void main(String[] args) {
    int[] arr = {2, 3, 4, 6, 8, 10};
    int target = 10;
    List<List<Integer>> pairs = findPairSum2(arr, target);
    System.out.println("Target value index: " + pairs);
  }
}
