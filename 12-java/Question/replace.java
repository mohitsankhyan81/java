
import java.util.Scanner;

public class replace{
  public static void main(String arg[]){
    Scanner sn= new Scanner(System.in);
    String str1=sn.next();
    String result="";

    for(int i=0;i<str1.length();i++){
      if(str1.charAt(i)=='e'){
        result+='i';
      }
      else{
        result+=str1.charAt(i);
      }
    }
    System.out.println(result);
  }
}