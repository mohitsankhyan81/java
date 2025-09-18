class base{
  int x;

  public int getdata(){
    return x;
  }

  public void setdata(int a){
    x=a;
  }
  public void printMe(){
    System.out.println("I am a constructor");
  }
}

class drive extends base{
  int y;

  public int gety(){
    return y;
  }

  public void sety(int y){
    this.y=y;
  }
}

public class inhardance {
  public static void main(String arg[]){
    drive d=new drive();
    d.setdata(45);
    d.sety(22);
    System.out.println(d.getdata());
    System.out.println(d.gety());
    d.gety();
    d.printMe();
  }
}
