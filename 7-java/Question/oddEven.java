
import java.util.Scanner;

public class oddEven{

  public static int oddEvenn(int n){
    if(n%2==0){
      return 0;
    }
    else{
      return 1;
    }
  }

  public static void main(String arg[]){
    Scanner sn=new Scanner(System.in);
    System.out.print("Enter the value of n ");
    int n=sn.nextInt();

    int nis= oddEvenn(n);
    if(nis==0){
      System.out.print("Even");
    }
    else{
      System.out.print("odd");
    }
  }
}