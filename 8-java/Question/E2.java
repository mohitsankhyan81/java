
import java.util.Scanner;

public class E2{

  public static void sumofodd(int n){
    int sum=0;
    for(int i=1;i<=n;i++){
      if(i%2!=0){
        sum=sum+i;
      }
    }
    System.out.print("sum of n odd number "+sum);
  }
  public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n ");
    int n=sc.nextInt();
    sumofodd(n);
  }
}