import java.util.*;

import java.io.*;

public class Main {

  static class Student implements Comparable< Student> {
    int rno;
    int ht;
    int weight;

    Student(int rno, int ht, int weight)
    {
      this.rno = rno;
      this.ht = ht;
      this.weight = weight;
    }

    public int compareTo(Student o)
    {
      return o.rno - this.rno;
    }

    public String toString()
    {
      return "rno= " + rno + " height= " + ht + " weight= " + weight;
    }
  }

  static class StudentHtComparator implements Comparator< Student> {
    public int compare(Student s1, Student s2)
    {
      return s1.ht - s2.ht;
    }
  }

  static class StudentWtComparator implements Comparator< Student>
  {
    public int compare(Student s1, Student s2)
    {
      return s1.weight - s2.weight;
    }
  }

  public static void main(String[] args)
  {
    PriorityQueue< Student> pq = new PriorityQueue<>(new StudentHtComparator());

    pq.add(new Student(1, 180, 82));
    pq.add(new Student(2, 170, 81));
    pq.add(new Student(3, 200, 85));
    pq.add(new Student(4, 190, 87));
    pq.add(new Student(5, 185, 70));

    while (pq.size() != 0)
    {
      System.out.println(pq.peek());
      pq.remove();
    }
  }
}