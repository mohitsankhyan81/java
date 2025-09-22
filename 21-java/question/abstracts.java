abstract class base{
  public base(){
    System.out.println("Mai base ka constructor ba");
  }

  public void sayhello(){
    System.out.println("hello");
  }
  abstract public void greet();
}

class child extends base{
  @Override
  public void greet(){
    System.out.println("Hello My name is mohit sankhyan");
  }
}

abstract class childboy extends base{
  public void th(){
    System.out.println("i am good");
  }
}
public class abstracts{
  public static void main(String arg[]){
    
  }
}