//method over lapping

class room{
  int length;
  int breadth;

  room(int a,int b){
    length=a;
    breadth=b;
  }
  room(int x){
    length=breadth=x;
  }
  int area(){
    return (length*breadth);
  }
}

public class constructor{
  public static void main(String arg[]){
    room per= new room(3,4);
    room per1=new room(3);

    System.out.println(per.area());
    System.out.println(per1.area());
  }
}