
import java.util.Scanner;

public class E3{

  public static void numbers(int a,int b){
    if(a==b){
      System.out.print("A and B are Equal");
    }
    else if(a>b){
      System.out.print("a is greater than b");
    }
    else{
      System.out.print("b is greater than a");
    }
  }
  public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of a ");
    int a=sc.nextInt();
    System.out.print("Enter the value of b ");
    int b=sc.nextInt();

    numbers(a,b);
  }
}