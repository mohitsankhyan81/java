
import java.util.Scanner;

public class evenOdd{
  public static void main(String arg[]){
    System.out.println("Number is even or odd");

    Scanner a= new Scanner(System.in);
    System.out.println("Enter the value of n ");
    int number = a.nextInt();


    if(number%2==0){
      System.out.print("Even");
    }
    else{
      System.out.println("odd");
    }
  }
}