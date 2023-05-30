package com.example.datastructure.binarysearchtree;

public class BinarySearchTreeRecursive {
  public static void main(String[] args) {
    BinarySearchTree myBST = new BinarySearchTree();

    myBST.insert(47);
    myBST.insert(21);
    myBST.insert(76);
    myBST.insert(18);
    myBST.insert(27);
    myBST.insert(52);
    myBST.insert(82);

    System.out.println("BST Contains 27:");
    System.out.println(myBST.rContain(27));

    System.out.println("\nBST Contains 17:");
    System.out.println(myBST.rContain(17));

  }
}
