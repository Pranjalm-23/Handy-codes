import java.util.*;

public class Main {
  public static class Person{
     int age;
     String name;

     Person(){
       // default constructor
     }

     Person(int age, String name){
      // parameterised constructor
      this.age = age;
      this.name = name;
    }


     void saysHi(){
       System.out.println(name+"["+age+"] says hi");
       
     }
  }

  public public static void main() {
    Person p1 = new Person();
    p1.age = 21;
    p1.name = "Pranjal";

    Person p2 = new Person(17, "Nitin");
   

    p1.saysHi();
    p2.saysHi();

  }

  // when a function is called 
  // s-1> space allocation
  // s-2> parsing
  // s-3> constructor(new)

}