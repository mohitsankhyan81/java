class mobile {
  String brand;
  int price;
  static String name;

  static {
    name = "phone";
    System.out.println("This is a static block");
  }

  mobile() {
    brand = "";
    price = 354;
    System.out.println("this is a constructor");
  }

  void show() {
    System.out.println(brand + " " + price + " " + name);
    System.out.println("this is a function");
  }
}

public class static3 {
  public static void main(String arg[]) throws ClassNotFoundException {
    Class.forName("mobile");
  }
}
