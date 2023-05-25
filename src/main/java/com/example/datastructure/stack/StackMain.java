package com.example.datastructure.stack;

public class StackMain {
  public static void main(String[] args) {

    Stack myStack = new Stack(2);
    myStack.push(1);

    // (2) Items - Returns 1 Node
    System.out.println(myStack.pop().value);
    // (1) Item - Returns 2 Node
    System.out.println(myStack.pop().value);
    // (0) Items - Returns null
    System.out.println(myStack.pop());


        /*
            EXPECTED OUTPUT:
            ----------------
            1
            2
            null

        */

  }
}
