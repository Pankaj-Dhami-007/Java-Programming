public class BubbleSort {
    static void sortBubble(int arr[], int n){
        for(int i =0; i<n; i++){
            for(int j = 0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
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
        int arr[] = {9, 7, 8, 0, 0, 3, 4, 5};
        int n = arr.length;
        System.out.println("Before Sorting: ");
        printArray(arr);
        sortBubble(arr,n);
        System.out.println("After Sorting: ");
        printArray(arr);
    }
}
