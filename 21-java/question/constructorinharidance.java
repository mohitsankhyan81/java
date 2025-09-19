class  base{
  public int x;

  base(){
    System.out.println("This is a construnctor");
  }
  // public int getx(){
  //   return x;
  // }

  // public void setdata(int ss){
  //   x=ss;
  // }

  base(int a){
    System.out.println("I am a overloaded constructor with the val of a as : "+ a);
  }
}

class drive extends base{

  drive(){
    // super(0);
    System.out.println("This is the drived class constructor");
  }
  // public int  y;
  // public int gety(){
  //   return y;
  // }

  // public void sety(int y){
  //   this.y=y;
  // }

  drive(int x,int y){
    super(x);
    System.out.println("This the overloaded construnctor with calues a and b : "+x + " "+ y);
  }
}


class childofdrive extends drive{

    childofdrive() {
      System.out.println("This is the child of drived class");
    }
    childofdrive(int x,int y,int z){
      super(x,y);
      System.out.println("This is the child of drived class z as " + x+y+z);
    }
  
}
public class constructorinharidance {
  public static void main(String arg[]){
    // base b=new base();
    // drive d=new drive(2,3);
    childofdrive c=new childofdrive(1,2,3);
  }
}
