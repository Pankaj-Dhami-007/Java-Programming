

public class ReverseArray {
    static void reverse(int arr[]){
        int i = 0;
        int j = arr.length-1;

         while(i< j){
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
             i++;
             j--;
         }
        for (int num : arr) {
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7};
        reverse(nums); 
    }
}
