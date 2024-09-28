public class LenearSearch {
    static void search(int arr[], int n){
          int index = -1;
          for(int i =0; i< arr.length; i++){
            if(arr[i] == n){
                index = i;
                break;
            }
          }
          if(index == -1){
            System.out.println("Search unsuccessful");
          } else
          System.out.println("Element found At "+ index + " index: ");
    }
    public static void main(String args[]){
        int arr[] = {10, 20, 30, 66, 3, 100, 45, 90, 95};
        int n = 90;
        search(arr, n);
    }
}
