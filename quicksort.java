public class quicksort {

  public static int partition(int arr[],int low,int high){
    int pivot=arr[high];
    int i=low-1;

    for(int j=low;j<high;j++){
      if(arr[j]<pivot){
        i++;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
      }
    }
    i++;
    int temp=arr[i];
    arr[i]=pivot;
    arr[high]=temp;
    return i;
  }

  public static void quicksort1(int arr[],int low ,int high){
    if(low<high){
      int pivot=partition(arr, low, high);

      quicksort1(arr, low, pivot-1);
      quicksort1(arr,pivot+1,high);
    }
  }
  public static void main(String arg[]){
    int[] arr={4,2,9,5,3,7,8};
    int n=arr.length;

    quicksort1(arr,0,n-1);

    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
