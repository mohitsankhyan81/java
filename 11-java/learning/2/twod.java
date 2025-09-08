
import java.util.Scanner;

//two d array

public class twod{
  public static void main(String arg[]) {
      Scanner sn = new Scanner(System.in);
      System.out.print("row ");
      int r=sn.nextInt();
      System.out.print("col ");
      int c=sn.nextInt();

      int twod[][]=new int[r][c];
      System.out.println("Enter input values ");
      for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
          twod[i][j]=sn.nextInt();
        }
      }
      System.out.println("Output Show like a wow ");
      for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
          System.out.print(twod[i][j]+" ");
        }
        System.out.println();
      }
  }
}