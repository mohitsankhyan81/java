class employes{
  private int id;
  private String name;

  public void setdata(String n,int i){
    name=n;
    id=i;
  }
  public void getdata(){
    System.out.println("Name is "+name);
    System.out.println("Id is "+id);
  }
}

public class acces1 {
  public static void main(String arg[]){
    employes my=new employes();
    my.setdata("Mohit Sankhyan",4362);
    my.getdata();
  }
}
