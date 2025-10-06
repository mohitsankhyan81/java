
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Product{
  private String name;
  private double price;

  Product(String name,double price){
    this.name=name;
    this.price=price;
  }

  double getprice(){
    return price;
  }
  String getname(){
    return name;
  }

  void display(int index){
    System.out.println(index+". "+name+" - $"+price);
  }
}

class Customer{
  private String name,address,phone;

    public Customer(String n,String a,String p) {
      name=n;
      address=a;
      phone=p;
    }

    void display(){
      System.out.println("name: "+name+"\nAddress: "+address+"\nPhone No: "+phone);
    }
}

class Order{
  protected int orderId;
  protected Customer customer;
  protected ArrayList<Product> orderedProducts=new ArrayList<>();
  protected ArrayList<Integer> quantities=new ArrayList<>();
  protected String paymentMethod;


  Order(int orderId,Customer c,String paymentMethod){
    this.orderId=orderId;
    this.customer=c;
    this.paymentMethod=paymentMethod;
  }

  void addProduct(Product p,int qty){
    orderedProducts.add(p);
    quantities.add(qty);
  }

  double calcTotal(){
    double total=0;
    for(int i=0;i<orderedProducts.size();i++){
      total+=orderedProducts.get(i).getprice()*quantities.get(i);
    }
    return total;
  }


  void displayOrder(){
    System.out.println("\n OrderSummary (ID: "+orderId+")");
    customer.display();
    System.out.println("\n Ordered Product:");
    for(int i=0;i<orderedProducts.size();i++){
      Product p=orderedProducts.get(i);
      int q=quantities.get(i);
      System.out.println("Items "+p.getname()+"| $"+p.getprice()+" x "+q+"= $ "+(p.getprice()*q));
    }
    System.out.println("Payment Mode: "+paymentMethod);
    System.out.println("Total: $"+calcTotal());
  }
}


class Delivery extends Order{
  private String deliveryAddress,status;
  private double deliveryCharge;

    Delivery(int orderId,Customer c,String paymentMethod,String add,double charge,String status) {
      super(orderId,c,paymentMethod);
      this.deliveryAddress=add;
      this.deliveryCharge=charge;
      this.status=status;
    }

    @Override
    double calcTotal(){
      return super.calcTotal()+deliveryCharge;
    }

    @Override
    void displayOrder(){
      super.displayOrder();
      System.out.println("Delivery address: "+deliveryAddress);
      System.out.println("Delivery Charge "+deliveryCharge);
      System.out.println("Final Amount "+calcTotal());
      System.out.println("Status"+status);
    }
  
}

public class onlinebooking {
  public static void main(String arg[]){
    Scanner sn=new Scanner(System.in);
    Random rand=new Random();

    System.out.println("==== ONLINE ORDER & DELIVERY SYSTEM ====");

    ArrayList<Product> catalog=new ArrayList<>();
    catalog.add(new Product("pizza", 250));
    catalog.add(new Product("Burger",120));
    catalog.add(new Product("Pasta",180));
    catalog.add(new Product("Cold Drink", 60));
    catalog.add(new Product("Ice Cream",90));


    System.out.println("\n Avilable Products");
    for(int i=0;i<catalog.size();i++)
    catalog.get(i).display(i+1);


    System.out.println("\nEnter Customer Name: ");
    String name=sn.nextLine();

    System.out.println("Enter Address");
    String add=sn.nextLine();

    System.out.println("Enter Phone: ");
    String phone=sn.nextLine();
    Customer c=new Customer(name ,add,phone);

    int orderid=rand.nextInt(10000);
    System.out.println("\nEnter Payment Mode(Cash/Card/UPI): ");
    String pay=sn.nextLine();
    System.out.println("Enter Delivery Address:");
    String address=sn.nextLine();
    System.out.println("Enter Delivery Charge: ");
    double charge=sn.nextDouble();
    sn.nextLine();
    System.out.println("Enter Status (pending/delivered): ");
    String status=sn.nextLine();

    Delivery d=new Delivery(orderid, c, pay, address, charge, status);


    System.out.println("\nHow many different item you want to order");
    int count=sn.nextInt();
    for(int i=0;i<count;i++){
      System.out.println("ENter product number (1-"+catalog.size()+"):");
      int choice=sn.nextInt();
      System.out.println("enter quantity: ");
      int qty=sn.nextInt();
      d.addProduct(catalog.get(choice-1),qty);
    }
    System.out.println("\n====ORDER DETAIlS====");
    d.displayOrder();
    System.out.println("Thank you for shopping with us!");
    sn.close();
  }

}
