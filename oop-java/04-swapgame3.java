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

    swap1(p1,p2);  // don't work

    p1.saysHi();
    p2.saysHi();
  }

  public static void swap1(Person per1, Person per2){
    per1 = new Person();

    int age = per1.age;
    per1.age = per2.age;
    per2.age = age;

    per2 = new Person();

    String name = per1.name;
    per1.name = per2.name;
    per2.name = name;
  }
}