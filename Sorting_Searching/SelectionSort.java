public class SelectionSort {
    static void sortSelection(int arr[]){
        int n = arr.length;
        for(int i =0; i< n-1; i++){// i = current index
            // find min element
            int minElement = i;
            for(int j = i+1; j<n; j++){
                if(arr[j] < arr[minElement]){
                     minElement = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minElement];
            arr[minElement] = temp;
        }
        //Swp current element and min element.
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
        sortSelection(arr);
        System.out.println("After Sorting: ");
        printArray(arr);
    }
}
