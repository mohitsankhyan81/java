class A{
  public int a;
  public int harry(){
    return 4;
  }
  public void method2(int a){
    System.out.println("This is the method 2 for class A");
  }
}


class B extends A{
  public void method2(){
    System.out.println("I am method 2 of class B");
  }
  public void math3(){
    System.out.println("This the method 3 for class b");
  }
}
public class methodoverrighting {
  public static void main(String arg[]){
    A a=new A();
    a.method2();


    B b=new B();
    b.method2(); 
  }
}
