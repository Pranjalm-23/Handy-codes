import java.util.*;

public class Main {
  public static class Person{
     int age;
     String name;

     void saysHi(){
       System.out.println(name+"["+age+"] says hi");
       
     }
  }

  public public static void main() {
    Person p1 = new Person();
    p1.age = 21;
    p1.name = "Pranjal";

    Person p2 = new Person();
    p2.age = 17;
    p2.name = "Nitin";

    p1.saysHi();
    p2.saysHi();

    swap1(p1,p2); // doesn't work because only references were swapped, which are dismissed after the completion of function

    p1.saysHi();
    p2.saysHi();
  }

  public static void swap1(Person per1, Person per2){
    Person temp  = per1;
    per1 = per2;
    per2 = temp;
  }
}