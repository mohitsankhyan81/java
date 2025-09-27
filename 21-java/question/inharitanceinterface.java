interface sampleinterface{
  void meth1();
  void meth2();
}

interface childsampleinterface extends sampleinterface{
  void meth3();
  void meth4();
}

class Mysampleclass implements  childsampleinterface{
  public void meth3(){
    System.out.println("My name is one");
  }
  public void meth4(){
    System.out.println("My name is two");
  }
  public void meth1(){
    System.out.println("My name is three");
  }
  public void meth2(){
    System.out.println("My name is four");
  }
}



public class inharitanceinterface{
  public static void main(String arg[]){
    Mysampleclass m=new Mysampleclass();
    m.meth1();
    m.meth2();
    m.meth3();
    m.meth4();
  }
}