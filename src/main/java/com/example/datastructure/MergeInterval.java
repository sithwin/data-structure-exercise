package com.example.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
  public static List<List<Integer>> mergeIntervals(int[][] intervals) {


    List<List<Integer>> pairs = new ArrayList<>();

    // Sort the intervals based on the start time
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    for (int i = 1; i< intervals.length; i++) {
      // second start < first end
      if(intervals[i][0] < intervals[i - 1][1] ) {
        List<Integer> pair = new ArrayList<>();
        pair.add(intervals[i-1][0] );
        pair.add(intervals[i][1] );
        pairs.add(pair);
      }
    }
    return pairs;
  }

  public static void main(String[] args) {
    int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
    List<List<Integer>> merged = mergeIntervals(intervals);

    System.out.println("Merged value index: " + merged);
  }
}
