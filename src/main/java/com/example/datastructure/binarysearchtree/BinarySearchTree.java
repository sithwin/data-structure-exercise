package com.example.datastructure.binarysearchtree;

public class BinarySearchTree {

  private Node root;

  class Node {
    public int value;
    public Node left;
    public Node right;

    Node(int value) {
      this.value = value;
    }
  }

  public boolean insert(int value) {
    Node newNode = new Node(value);
    if (root == null) {
      root = newNode;
      return true;
    }
    Node temp = root;
    while (true) {
      if (newNode.value == temp.value) return false;
      if (newNode.value < temp.value) {
        if (temp.left == null) {
          temp.left = newNode;
          return true;
        }
        temp = temp.left;
      } else {
        if (temp.right == null) {
          temp.right = newNode;
          return true;
        }
        temp = temp.right;
      }
    }
  }

  public boolean contains(int value) {
    if (root == null) return false;
    Node temp = root;
    while (temp != null) {
      if (value < temp.value) {
        temp = temp.left;
      } else if (value > temp.value) {
        temp = temp.right;
      } else {
        return true;
      }
    }
    return false;
  }

  private boolean rContain(BinarySearchTree.Node node, int value) {
    if (node == null) return false;

    if (node.value == value) return true;

    if (value < node.value) {
      return rContain(node.left, value);
    } else  {
      return rContain(node.right, value);
    }
  }

  boolean rContain(int value) {
    return rContain(root, value);
  }
}
