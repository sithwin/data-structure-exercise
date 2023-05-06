package com.example.datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class BalancedParentheses {
  public boolean isBalanced(String input) {
    Stack<Character> stack = new Stack<>();

    for (char c : input.toCharArray()) {
      if (c == '(') {
        stack.push(c);
      } else if (c == ')') {
        if (stack.isEmpty()) {
          return false;
        }
        stack.pop();
      }
    }

    return stack.isEmpty();
  }
}
