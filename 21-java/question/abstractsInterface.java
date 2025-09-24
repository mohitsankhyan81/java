interface Bicycle{
  void applybreak(int decrement);
  void speedup(int increment);
}

class MohitCycle implements Bicycle{
  void bioHorn(){
    System.out.println("pee pee poo poo");
  }
  public void applybreak(int decrement){
    System.out.println("break apply");
  }
  public void speedup(int increment){
    System.out.println("Applying speedup");
  }
}
public class abstractsInterface {
  public static void main(String arg[]){
    MohitCycle c=new MohitCycle();
    //you can create properties in Interfaces
    //you can not modify you properties in interfacees
    c.applybreak(1);
  }
}
