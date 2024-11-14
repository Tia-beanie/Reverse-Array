public class ReverseArray {
    public static void main(String[] args){

        int[] arr = {12, 35, 21, 75, 125, 5};

        reverseArr(arr);

        System.out.print("New array is: ");
        
        for(int i = 0; i < arr.length; i++){
            
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArr(int arr[]){
        
        for(int i = 0, j = arr.length-1; i < j; i++, j--){
            int temp;

            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
 