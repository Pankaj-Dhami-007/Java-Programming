import java.util.Arrays;

public class InsertionSort {
    static void sortInsertion(int arr[]){
        int n = arr.length;
        for(int i =1; i<n; i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                // swap
                
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                System.out.println("i: " + i + ", j: " + j + ", arr: " + Arrays.toString(arr));
                j--;
 
            }
            
        }
    }
    static void printArray(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {9, 7, 8, 2, 11, 3, 4, 5};
        System.out.println("Before Sorting: ");
        printArray(arr);
        sortInsertion(arr);
        System.out.println("After Sorting: ");
        printArray(arr);
    }
}
