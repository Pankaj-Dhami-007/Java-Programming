import java.util.Arrays;

public class Array {
    static int[] sortArray(int arr[]){
        int ans[] = new int[arr.length];
        int i = 0;
        int j = arr.length-1;
        int index = j;
        while(i <= j){
            if(arr[i]> arr[j]){
                ans[index] = arr[i];
                i++;
            } else{
                ans[index] = arr[j];
                j--;
            }
            index--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(sortArray(arr)));
    }
}
