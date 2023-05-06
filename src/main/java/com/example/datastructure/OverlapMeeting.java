package com.example.datastructure;

import java.util.Arrays;
import java.util.Comparator;

public class OverlapMeeting {
  public static int findOverlapMeeting(int[][] meetings) {
    Arrays.sort(meetings, Comparator.comparing(meeting -> meeting[0]));

    int count = 0;
    for (int i = 1; i< meetings.length; i++) {
      // second start < first end
      if(meetings[i][0] < meetings[i - 1][1] ) {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    int[][] meetings = {{1, 3},
                        {2, 4},
                        {3, 5},
                        {4, 6},
                        {5, 7}};
    int overlap = findOverlapMeeting(meetings);
    System.out.println("Maximum overlap of meetings: " + overlap);
  }
}
