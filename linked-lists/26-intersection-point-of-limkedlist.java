public static int findIntersection(LinkedList one, LinkedList two) {

  Node t1 = one.head;
  //1
  Node t2 = two.head;
  int delta = Math.abs(one.size - two.size); //2

  if (one.size > two.size) { //3
    for (int i = 0; i < delta; i++) {
      t1 = t1.next;
    }
  } else if (two.size > one.size) {
    for (int i = 0; i < delta; i++) {
      t2 = t2.next;
    }
  }

  while (t1 != t2) { //4
    t1 = t1.next;
    t2 = t2.next;
  }

  return t1.data; //5
}
