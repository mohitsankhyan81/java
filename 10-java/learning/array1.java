
import java.util.Scanner;

public class array1{
  public static void main(String agr[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size");
    int size= sc.nextInt();
    
    int number[]=new int[size];
    for(int i=0;i<size;i++){
      number[i]=sc.nextInt();
    }
    System.out.print("Your entered array");
    for(int i=0;i<size;i++){
      System.out.print(" "+number[i]);
    }
  }
}