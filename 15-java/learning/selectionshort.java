public class selectionshort{

  public static void bubbleshortcode(int arr[]){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static void main(String arg[]){
    int arr[]={23,56,32,22,34};
    int n=arr.length;

    for(int i=0;i<n-1;i++){
      int smallest=i;
      for(int j=i+1;j<n;j++){
        if(arr[smallest]>arr[j]){
          smallest=j;
        }
      }
      int temp=arr[smallest];
      arr[smallest]=arr[i];
      arr[i]=temp;
    }

    bubbleshortcode(arr);
  }
}