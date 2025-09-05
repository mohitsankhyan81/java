
import java.util.Scanner;

//create a table

public class Que2{
  public static void main(String arg[]){
    Scanner sn= new Scanner(System.in);
    System.out.print("Enter the number which table your want ");
    int n=sn.nextInt();
    for(int i=1;i<=10;i++){
      System.out.println(n+" X "+ i +" X "+n*i);
    }
  }
}