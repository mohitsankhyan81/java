
import java.util.Scanner;

//compare two strings

public class Compar{
  public static void main(String args[]) {
    Scanner sn=new Scanner(System.in);
    System.out.print("Enter 1string");
    String str1= sn.nextLine();

    System.out.print("Enter str2");
    String str2=sn.nextLine();

    if(str1.compareTo(str2)==0){
      System.out.println("String are equal");
    }
    else{
      System.out.print("String is not equal");
    }
  }
}