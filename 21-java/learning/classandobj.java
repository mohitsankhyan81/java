public class classandobj{

  static class Rectangle{
    int length,width;
    void getdata(int l,int m){
      length=l;
      width=m;
    }

    int rectarea(){
      int area=length*width;
      return (area);
    }
  }
  public static void main(String arg[]){
    int area1,area2;
    Rectangle rect1=new Rectangle();
    Rectangle rect2=new Rectangle();
    
    rect1.length=43;
    rect2.width=23;

    area1=rect1.length*rect2.width;
    rect2.getdata(54,34);

    area2=rect2.rectarea();

    System.out.print("Area1 = "+area1);
 
    System.out.print("Area2 = "+area2);

  }
}