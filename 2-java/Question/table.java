
import java.util.Scanner;

public class table{
  public static void main(String arg[]){
    System.out.println("This the table ");

    Scanner n1=new Scanner(System.in);
    System.out.println("Enter value of n");
    int n=n1.nextInt();
    
    System.out.println(n + " X 1 X "+ (n*1));
    System.out.println(n + " X 2 X "+ (n*2));
    System.out.println(n + " X 3 X "+ (n*3));
    System.out.println(n + " X 4 X "+ (n*4));
    System.out.println(n + " X 5 X "+ (n*5));
    System.out.println(n + " X 6 X "+ (n*6));
    System.out.println(n + " X 7 X "+ (n*7));
    System.out.println(n + " X 8 X "+ (n*8));
    System.out.println(n + " X 9 X "+ (n*9));
    System.out.println(n + " X 10 X "+ (n*10));

  }
}