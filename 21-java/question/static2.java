class mobile{
  String brand;
  int price;
  static String name;

  void show(){
    System.out.println(brand+" "+price+" "+name);
  }

  static void show1(mobile obj){
    System.out.println("In ths static method"+obj.brand+" "+obj.price+" "+name);
  }
}


public class static2 {
  public static void main(String arg[]){
    mobile obj=new mobile();
    obj.brand="apple";
    obj.price=4335636;
    mobile.name="iphone";
    mobile obj2=new mobile();
    obj2.brand="motarola";
    obj2.price=24355245;

    obj.show();
    obj2.show();

    mobile.show1(obj);
  }
}
