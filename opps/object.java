public class object{
  public class Rectangle{
    int length;
    int breadth;

    int area(){
      return length*breadth;
    }
  }
  public static void main(String arg[]){
    object obj=new object();
    Rectangle r=obj.new Rectangle();

    r.length=10;
    r.breadth=10;
    System.out.println("Area "+r.area());
  }
}