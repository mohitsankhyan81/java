class employ{
  int id;
  String name;
  int salary;

  public void printmydetails(){
    System.out.println("MY name is mohit sankhyan");
  }
}

public class basic5 {
  public static void main(String arg[]){
    System.out.println("THis is the costom calss");
    employ harray=new employ();
    //setting attributes
    harray.name="Mohit sankhyan";
    harray.id=435;
    harray.salary=432;
    System.out.println(harray.id);
    System.out.println(harray.name);
    harray.printmydetails();
  }
}