
import java.util.Scanner;

public class radius{
  public static void main(String arg[]){
    Scanner s =new Scanner(System.in);
    int side= s.nextInt();
    System.out.println(side);

    int area=side*side;
    System.out.print("The area is ");
    System.out.println(area);
  }
}