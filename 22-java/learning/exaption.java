import java.util.*;

class myexaption extends Exception{
  @Override
  public String toString(){
    return "this is Tostring";
  }
  @Override
  public String getMessage(){
    return "this is getmessage";
  }
}

public class exaption {
  public static void main(String arg[]){
    Scanner sn=new Scanner(System.in);
    System.out.println("Enter the value of a ");
    int a=sn.nextInt();
    if(a<99){
      try{
         throw new myexaption();
      }
      catch(Exception e){
        System.out.println(e.getMessage()+"error accor");
        System.out.println(e.toString());
      }
    }
  }
}
