
import java.util.Scanner;

public class fact{

  public static void fact(int n){
    int res=1;
    for(int i=1;i<=n;i++){
      res=res*i;
    }
    System.out.println(res);
  }

  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n ");
    int n=sc.nextInt();

    fact(n);
  }
}