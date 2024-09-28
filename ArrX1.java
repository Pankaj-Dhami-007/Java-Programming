public class ArrX1 {
    static boolean isSorted(int arr[]){
        boolean check = true;
        for(int i =1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                check = false;
                break;
            }
        }
        return check;
    } 
    public static void main(String[] args) {
        int arr[] = {1, 2, 34, 6, 9};
        System.out.println("isSorted: "+isSorted(arr));
    }
}
