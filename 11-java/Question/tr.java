
import java.util.Scanner;

public class tr{
  public static void main(String arg[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("row ");
    int r = sc.nextInt() ;
    System.out.print("col ");
    int c = sc.nextInt();
 
    int arr[][]=new int[r][c];
    System.out.println("Input the array");

    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    int temp[][]=new int[r][c];
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        temp[j][i]=arr[i][j];
      }
    }
    System.out.println("Here is the transpose of the matrix");
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        System.out.print(temp[i][j]+" ");
      }
      System.out.println();
    }
  }
}