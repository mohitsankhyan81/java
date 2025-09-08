
import java.util.Scanner;

//find no in java

public class f1{
  public static void main(String arg[]) {
      Scanner sn=new Scanner(System.in);
      System.out.print("Enter the size");
      int size=sn.nextInt();

      int number[]=new int[size];

      for(int i=0;i<size;i++){
        number[i]=sn.nextInt();
      }
      System.out.print("Enter the value of x ");
      int x=sn.nextInt();
      System.out.println("Your array is");
      for(int i=0;i<size;i++){
        System.out.println("at index : "+i+" - "+ number[i]);
      }

      for(int i=0;i<size;i++){
        if(number[i]==x){
          System.out.print("The index is "+i);
        }
      }
  }
}