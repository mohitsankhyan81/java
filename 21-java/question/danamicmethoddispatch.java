class one{
  public void greet(){
    System.out.println("Good Morning");
  }
  public void name(){
    System.out.println("My name is java");
  }
}

class two extends one{
  public void welcome(){
    System.out.println("Your welcome");
  }
  public void name(){
    System.out.println("My name is java in class two");
  }
}
public class danamicmethoddispatch {
  public static void main(String arg[]){
    // one obj=new one(); 
    // obj.name();
    // obj.greet();
    one obj1=new two();
    obj1.greet();
    obj1.name();    
  }
}
