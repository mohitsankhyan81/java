
import java.util.Scanner;

public class bounus{
  public static void main(String arg[]){

    Scanner sc=new Scanner(System.in);
    int ch;
    do{
      System.out.println("Enter 1 to input marks, enter 0 to stop :");
      ch=sc.nextInt();
      if(ch==1){
        System.out.println("Enter marks from 1-100");
        int m=sc.nextInt();
        if(m<0||m>100) System.out.println("Invalid Marks");
        else{
          if (m>=90) {
              System.out.println("This is Good");
          }
          else if(m>=89 && m<=60){
            System.out.println("THis is also good");
          }
          else{
            System.out.println("This is Good Well");
          }
            System.out.println("marks don't matters but our effort does");
        }
      }else if(ch!=0) System.out.println("Invalid choice");
    }while(ch!=0);
  }
}