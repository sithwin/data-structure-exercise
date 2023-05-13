package com.example.datastructure.linkedList2;

public class Main {

  public static void main(String[] args) {

    LinkedList2 myLinkedList = new LinkedList2(4);

    myLinkedList.getHead();
    myLinkedList.getTail();
    myLinkedList.getLength();

    System.out.println("\nLinked List:");
    myLinkedList.printList();

    myLinkedList.makeEmpty();
    myLinkedList.append(1);
    myLinkedList.append(2);

    myLinkedList.getHead();
    myLinkedList.getTail();
    myLinkedList.getLength();

    System.out.println("\nLinked List:");
    myLinkedList.printList();
  }
}
