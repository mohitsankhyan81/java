
import java.util.Scanner;

public class prime{
  public static void main(String arg[]) {
      Scanner sn=new Scanner(System.in);
      System.out.println("We Find the no is prime or not");
      System.out.println();
      System.out.println("Enter the value of n: ");
      int n=sn.nextInt();
      int c=0;
      if(n<=1){
        System.out.println(n+" Is not a prime no");
        return;
      }
      for(int i=2;i<=n/2;i++){
        if(n%i==0){
          c++;
          break;
        }
      }
      if(c==0) System.out.println(n+" is a prime number");
      else{
        System.out.println(n+" is Not a prime no");
      }
  }
}