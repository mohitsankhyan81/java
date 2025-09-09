
import java.util.Scanner;

public class Charat{
  public static void main(String arg[]){
    Scanner sn=new Scanner(System.in);
    System.out.print("Enter the value of name ");
    String name=sn.nextLine();
    for(int i=0;i<name.length();i++){
      System.out.println(name.charAt(i));
    }
  }
}