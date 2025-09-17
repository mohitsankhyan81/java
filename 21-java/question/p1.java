class employes{
  String name;
  int salary;

  public int getsalary(){
    return salary;
  }

  public String getname(){
    return name;
  }

  public void setname(String a){
    name=a;
  }
}

class cellphone{
  public void ringing(){
    System.out.println("Ringing...");
  }
  public void vivrating(){
    System.out.println("Vibrating...");
  }
  public void callfriend(){
    System.out.println("Call robinlodu");
  }
}


class Square{
  int side;

  public int area(){
    return side*side;
  }

  public int peremeter(){
    return 4*side;
  }
}

class tommy{
  public void hit(){
    System.out.println("Hitting the enemey");
  }
  public void run(){
    System.out.println("Running from the enemy");
  }
  public void fire(){
    System.out.println("Firing on the enemy");
  }
}
public class p1 {
  public static void main(String arg[]){
    /*
    //problem 1;
    employes harry=new employes();

    harry.setname("Mohit sankhyan");
    harry.salary=24;
    System.out.println(harry.getname());
    System.out.println(harry.getsalary());
  

    //problem 2

    cellphone phone=new cellphone();
    phone.ringing();
    phone.vivrating();
    phone.callfriend();
*/

    //problem 3

    // Square voro =new Square();
    // voro.side=3;
    // System.out.println(voro.area());
    // System.out.println(voro.peremeter());

    tommy palyer=new tommy();
    palyer.fire();
    palyer.hit();
    palyer.run();
  }
}
