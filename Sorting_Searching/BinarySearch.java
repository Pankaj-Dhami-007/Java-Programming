import java.util.*;
public class BinarySearch {
    static int search(int arr[], int key){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            System.out.println("low: " + low + ", high: " + high + ", mid: " + mid + ", arr[mid]: " + arr[mid]);  // Debugging
             if(arr[mid] == key){
                return mid;

             }
             else if(arr[mid] > key){
                high = mid-1;
             } 
             else{
                low = mid+1;
             }

        }
        return -1;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the SIze of Array: ");
    int n = sc.nextInt();
    int num[] = new int[n];
    System.out.println("Enter the Element of Array: ");
    for(int i =0; i< n; i++){
        num[i] = sc.nextInt();
    }
    System.out.println("Array: ");
    for(int i =0; i< n; i++){
        System.out.print(num[i]+ " ");
    }
    System.out.println("Enter the Element to be search: ");
    int m = sc.nextInt();
    System.out.println(search(num,m));
    }
    

}
