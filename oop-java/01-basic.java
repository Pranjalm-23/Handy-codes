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

    Person p3 = p1; // reference to obj p1 is copied
    p3.age = 15;
    p3.saysHi();
    p2.saysHi();

  }
}