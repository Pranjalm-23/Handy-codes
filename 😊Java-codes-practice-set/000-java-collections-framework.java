// same as vector in c++

//Arraylist. It is another data-structure, just like an array (but very different). In Java, the developers have written a class for Arraylist and it's methods. Therefore, it is also called the "Arraylist class" many times.

// We say that it is a data-structure, which is a collection of similar data-types which are arranged in a contiguous memory.

import java.util.*;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;

public class Main {


  public static void main(String[] args) {

    //////////////////////////////////////// Arraylist ///////////////////////////////////////////////

    // new size automatically = n + n/2 +1

    ArrayList< Integer> al = new ArrayList< >(); //declares an integer arraylist
    Arraylist< String> a2 = new Arraylist < >(); //declares an arraylist of string

    // size
    System.out.println(a1.size());

    a1.add(10);
    a1.add(20);
    a1.add(30);
    a1.add(1, 1000); // adds 1000 at index 1

    System.out.print(a1);  //prints the entire list at one go

    for (int x : a1)
    {
      System.out.println(x); //each element belonging to a1 will get printed
    }

    int val = a1.get(1); //gets the value at index 1
    val = 10;

    for (int i = 0; i < a1.size(); i++)
    {
      System.out.println(a1.get(i));  //printing using get()
    }

    a1.set(1, 2000); //changes the value at index 1 to 2000;

    a1.remove(1) //removes the value at index 1

    a1.remove(Integer.valueOf(2000)); // if the value matches then deleted

    a2.addAll(a1);  // appends al elemnts in a2 to a1
    System.out.println(a2);
    
    a2.clear();
    System.out.println(a2);

    a1.contains(2000); // returns trrue or false

    Iterator<Integer> it = a1.iterator();

    while(it.hasNext(){   // check if there is next element
      System.out.println(it.next());  // next val
      
    })





    //////////////////////////////////////// stacks //////////////////////////////////////////////
    Stack<Integer> st = new Stack<>();
    st.push(10);
    st.push(20);   // adds
    st.push(30);

    System.out.println(st);

    System.out.println(st.peek());  // returns the top element

    System.out.println(st.pop());    // removes

    System.out.println(st);




    
    ///////////////////////////////////////// QUEUES ////////////////////////////////////

    ArrayDequeue<Integer> que = new ArrayDequeue<>();
    que.addLast(20);
    que.addLast(34);
    que.addLast(84);

    System.out.println(que);

    System.out.println(que.getFirst());
    
    System.out.println(que.removeFirst());

    System.out.println(que);



    // >>>>>>>>>>>>>>> Another way
    
    // Queue<Integer> queue = new LinkedList<>();

    // queue.offer(12);
    // queue.offer(24);
    // queue.offer(36);

    // System.out.println(queue);

    // System.out.println(queue.poll());

    // System.out.println(queue);

    // System.out.println(queue.peek());
    

    /////////////////////////////////// Priority QUEUES ////////////////////////////////////

    
    Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

    pq.offer(40);
    pq.offer(12);
    pq.offer(24);
    pq.offer(36);

    System.out.println(pq);
    pq.poll();
    System.out.println(pq);

    System.out.println(pq.peek());

    ///////////////////////////////////////// arraydeque ////////////////////////////////////


    ArrayDeque<Integer> adq = new ArrayDeque<>();

    adq.offer(23);
    adq.offerFirst(12);
    adq.offerLast(45);
    adq.offer(26);

    System.out.println(adq);

    System.out.println(adq.peek());
    System.out.println(adq.peekFirst());
    System.out.println(adq.peekLast());

    System.out.println(adq.poll());
    System.out.println("poll() " +adq);

    System.out.println(adq.pollFirst());
    System.out.println("pollFirst() " +adq);

    System.out.println(adq.pollLast());
    System.out.println("pollLast() " +adq);
    
    ///////////////////////////////////////// SET //////////////////////////////////////////

       Set<Integer> set = new HashSet<>();   // O1
      //  Set<Integer> set = new LinkedHashSet<>();

      //  Set<Integer> set = new TreeSet<>();   //bst  // logn

       set.add(32);
       set.add(2);
       set.add(54);
       set.add(21);
       set.add(65);

       System.out.println(set);

       set.remove(54);

       System.out.println(set);

       System.out.println(set.contains(21));

       System.out.println(set.isEmpty());

       System.out.println(set.size());

       set.clear();

       System.out.println(set);

  }

  // Set<Student> studentSet = new HashSet<>();

  //       studentSet.add(new Student("Anuj", 2));
  //       studentSet.add(new Student("Ramesh", 4));
  //       studentSet.add(new Student("Shivam", 3));

  //       studentSet.add(new Student("Rohit", 2));

  //       Student s1 = new Student("Anuj", 2);
  //       Student s2 = new Student("Rohit", 2);

  //       System.out.println(s1.equals(s2));
  //       System.out.println(studentSet);

  ///////////////////////////////////////// MAP ////////////////////////////////////

  Map<String, Integer> numbers = new TreeMap<>();

  numbers.put("One", 1);
  numbers.put("Two", 2);
  numbers.put("Three", 3);
  numbers.put("Four", 4);
  numbers.put("Five", 5);


  numbers.remove("Three");

//        if(!numbers.containsKey("Two")) {
//            numbers.put("Two", 23);
//        }

//        numbers.putIfAbsent("Two", 23);
  System.out.println(numbers);
  System.out.println(numbers.containsValue(3));

  System.out.println(numbers.isEmpty());

//        for (Map.Entry<String, Integer> e: numbers.entrySet()) {
//            System.out.println(e);
//
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }
//
//        for (String key: numbers.keySet()) {
//            System.out.println(key);
//        }
//
//        for(Integer value: numbers.values()) {
//            System.out.println(value);
//        }


///////////////////////////////////////// ArrayS ////////////////////////////////////


//        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//        int index = Arrays.binarySearch(numbers, 4);
//
//        System.out.println("The index of element 4 in the array is " + index);

Integer[] numbers = { 10, 2, 32, 12, 15, 76, 17, 48, 79, 9 };
Arrays.sort(numbers);

Arrays.parallelSort(numbers);
// 8192

Arrays.fill(numbers, 12);

for (int i : numbers) {
    System.out.print(i + " ");
}


///////////////////////////////////////// collections ////////////////////////////////////

List<Student> list = new ArrayList<>();

list.add(new Student("Anuj", 2));
list.add(new Student("Ramesh", 4));
list.add(new Student("Shivam", 3));
list.add(new Student("Rohit", 1));

Student s1 = new Student("Anuj", 2);
Student s2 = new Student("Rohit", 3);

//        System.out.println((s1.compareTo(s2)));

System.out.println(list);

Collections.sort(list, (o1, o2) -> o1.name.compareTo(o2.name));

System.out.println(list);


//        List<Integer> list = new ArrayList<>();
//        list.add(34);
//        list.add(12);
//        list.add(9);
//        list.add(9);
//        list.add(9);
//        list.add(76);
//        list.add(29);
//        list.add(75);
//
////        System.out.println("min element " + Collections.min(list));
////        System.out.println("max element " + Collections.max(list));
////        System.out.println(Collections.frequency(list, 9));
//
//        Collections.sort(list, Comparator.reverseOrder());
//
//        System.out.println(list);



}

// student class
public class Student implements Comparable<Student> {

  String name;
  int rollNo;

  public Student(String name, int rollNo) {
      this.name = name;
      this.rollNo = rollNo;
  }

  @Override
  public String toString() {
      return "Student{" +
              "name='" + name + '\'' +
              ", rollNo=" + rollNo +
              '}';
  }

  @Override
  public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Student student = (Student) o;
      return rollNo == student.rollNo;
  }

  @Override
  public int hashCode() {
      return Objects.hash(rollNo);
  }

  @Override
  public int compareTo(Student that) {
      return this.rollNo - that.rollNo;
  }
}