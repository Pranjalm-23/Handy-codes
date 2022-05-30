import java.io.*;

import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static Node construct(int[] arr, int lo, int hi) {

    int mid = (lo + hi) / 2;

    Node lchild = construct(arr, lo, mid - 1);
    Node rchild = construct(arr, mid + 1, hi);
    Node node = new Node(arr[mid], lchild, rchild);

    return node;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }

  public static int size(Node node) {
    if (node == null) {
      return 0;
    }
  
    int ls = size(node.left);
    int rs = size(node.right);
    int ts = ls + rs + 1;
    return ts;
  }
  
  public static int sum(Node node) {
    if (node == null) {
      return 0;
    }
  
    int ls = sum(node.left);
    int rs = sum(node.right);
    int ts = ls + rs + node.data;
    return ts;
  }
  
  public static int max(Node node) {
    if (node.right == null) {
      return node.data;
    } else {
      return max(node.right);
    }
  }
  
  public static int min(Node node) {
    if (node.left == null) {
      return node.data;
    } else {
      return min(node.left);
    }
  }
  
  public static boolean find(Node node, int data) {
    if (node == null) {
      return false;
    }
  
    if (data > node.data) {
      return find(node.right, data);
    } else if (data < node.data) {
      return find(node.left, data);
    } else {
      return true;
    }
  }

  public static void main(String[] args) throws Exception {
    int[] arr = {12, 25, 37, 50, 62, 75, 87};
    Node root = construct(arr, 0, arr.length - 1);
    display(root);
    int size = size(root);
    int sum = sum(root);
    int max = max(root);
    int min = min(root);
    boolean found = find(root, data);

    System.out.println(size);
    System.out.println(sum);
    System.out.println(max);
    System.out.println(min);
    System.out.println(found);
  }

}