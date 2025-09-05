
import java.util.Scanner;

public class cal{
  public static void main(String arg[]){
    System.out.println("We make a simple calcultor");

    Scanner sc=new Scanner(System.in);
    
    int a=sc.nextInt();
    char n=sc.next().charAt(0);
    int b=sc.nextInt();

    switch(n){
      case '+':
        System.out.println(a+b);
        break;
      case '-':
        System.out.println(a-b);
        break;
      case '*':
        System.out.println(a*b);
        break;
      case '/':
        System.out.println(a/b);
        break;
      case '%':
        System.out.println(a%b);
        break;
      default:
        System.out.println("Ivalid Calculation");
    }
  }
}