class ekclass{
  int a;

   ekclass(int a) {
      this.a=5;
    }
  
    public int getdata(){
      return a;
    }
  public int returnone(){
    return 1;
  }
}

class doclass extends ekclass{
  doclass(int c){
    super(c);
    System.out.println("I am a constructor " + c);
  }
}

public class thisandsupper {
  public static void main(String arg[]){
    ekclass e=new ekclass(4);
    System.out.println(e.getdata());
    doclass d=new doclass(8);
  }
}
