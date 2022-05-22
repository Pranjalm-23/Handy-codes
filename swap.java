public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int y = scan.nextInt();
    scan.close();

    // printing the initial values
    System.out.println("x = " + x + ", y = " + y);

    // swapping using third variable
    int temp;

    temp = x;   // step-1
    x = y;      // step-2
    y = temp;   // step-3
    
    // printing the final values
    System.out.println("x = " + x + ", y = " + y);
  }
}