interface Camra{
  public void takeSnap();
  public void recodevedio();
}

interface wify{
  String[] getNetwork();
  void connecttonetwork(String network);
}

class phoneclass{

  void callNumber(int phoneNumber){
    System.out.println("Calling "+phoneNumber);
  }

  void piccall(){
    System.out.println("Connecting...");
  }
}

class Mysmartphone extends phoneclass implements Camra,wify{
  public void takeSnap(){
    System.out.println("Taking snap");
  }
  public void recodevedio(){
    System.out.println("Recoding snap");
  }
  public String[] getNetwork(){
    System.out.println("Getting list of Networks");
    String networklist[]={"harry","mohit","sahil"};
    return networklist;
  }
  public void connecttonetwork(String network){
    System.out.println("Connected to "+network);
  }
}

public class interfacewithdefaultmethods{
  public static void main(String arg[]){
    Mysmartphone ms=new Mysmartphone();
    ms.getNetwork();
    String[] ar=ms.getNetwork();
    for (String item : ar) {
      System.out.println(item);
    }
  }
}