class circle{
  public int radius;

  circle(int a){
    System.out.println("I am circle parameter constructor");
    this.radius=a;
  }
  public double area(){
    return Math.PI * this.radius*this.radius;
  }
}

class cylinder extends circle{
    public int height;

    public cylinder(int r,int h) {
        super(r);
        this.height=h;
    }

    
  public double volume(){
    return Math.PI*this.radius*this.radius*this.height;
  }
}
public class p4 {
  public static void main(String arg[]){
    // circle c=new circle(32);
    cylinder obj=new cylinder(12,1);
    System.out.println(obj.volume());
  }
}
