
import java.util.Scanner;

public class sum{

  public static int numbersum(int a,int b){
    return a+b;
  }
  public static void main(String arg[]){
    Scanner sn= new Scanner(System.in);
    System.out.print("Enter the value of a ");
    int a=sn.nextInt();
    System.out.print("Enter the value of b ");
    int b=sn.nextInt();

    int sum=numbersum(a,b);
    System.out.print("Sum "+sum);
  }
}