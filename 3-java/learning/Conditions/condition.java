
import java.util.Scanner;

public class condition{
  public static void main(String arg[]){
    System.out.println("Cheacking you are aligible for vote or not ");
    Scanner a= new Scanner(System.in);
    System.out.println("Enter your age : ");
    int age=a.nextInt();

    if(age>=18){
      System.out.print("Eligible");
    }
    else{
      System.out.println("Not Eligible");
    }
  }
}