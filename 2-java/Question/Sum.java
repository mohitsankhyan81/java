
import java.util.Scanner;

public class Sum{
  public static void main(String arg[]){
    Scanner a1 = new Scanner(System.in);
    int a =a1.nextInt();
    System.out.print("Value of a is ");
    System.out.println(a);

    Scanner a2 =new Scanner(System.in);
    int b=a2.nextInt();
    System.out.print("Value of b is ");
    System.out.println(b);

    int sum=a+b;
    System.out.print("Sum is ");
    System.out.println(sum);
  }
}