
import java.util.Scanner;

public class check{
  public static void main(String arg[]){
    System.out.println("Number checking ");

    Scanner num= new Scanner(System.in);

    System.out.println("Enter the value of A ");
    int a = num.nextInt();

    System.out.println("Enter the value of B ");
    int b=num.nextInt();

    if(a==b){
      System.out.println("A and B are Equal");
    }
    else if (a>b) {
      System.out.println("a is greater than b ");
    }
    else{
      System.out.println("a is less than to b");
    }
  }
}