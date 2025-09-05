
import java.util.Scanner;



public class switchs{
  public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value ");
    int button= sc.nextInt();

    switch(button){
      case 1:
        System.out.println("Hello");
        break;
      case 2:
        System.out.println("Namaste");
        break;
      case 3:
        System.out.println("Good Morning");
        break;
      default:
        System.out.println("Good luck");
    }
  }
}