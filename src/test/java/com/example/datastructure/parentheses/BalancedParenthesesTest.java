package com.example.datastructure.parentheses;

import com.example.datastructure.BalancedParentheses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedParenthesesTest {
  private BalancedParentheses balancedParentheses = new BalancedParentheses();

  @Test
  void shouldReturnTrueFor1BalancedParentheses() {

    assertTrue(balancedParentheses.isBalanced("()"));
  }

  @Test
  void shouldReturnTrueFor2BalancedParentheses() {

    assertTrue(balancedParentheses.isBalanced("(())"));
  }

  @Test
  void shouldReturnTrueFor3BalancedParentheses() {
    assertTrue(balancedParentheses.isBalanced("(()())"));
  }

  @Test
  void shouldReturnTrueFor3Parentheses() {
    assertTrue(balancedParentheses.isBalanced("()()()"));
  }

  @Test
  void shouldReturnFalseFor1UnbalancedParentheses() {
    assertFalse(balancedParentheses.isBalanced(")("));
  }

  @Test
  void shouldReturnFalseForType1() {
    assertFalse(balancedParentheses.isBalanced("(()"));
  }

  @Test
  void shouldReturnFalseForType2() {
    assertFalse(balancedParentheses.isBalanced("((())"));
  }

  @Test
  void shouldReturnFalseForType3() {
    assertFalse(balancedParentheses.isBalanced("())()"));
  }
}