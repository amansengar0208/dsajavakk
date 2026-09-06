import java.util.*;
public class bubble {
    public static void main(String[] args) {
        int arr[] = {20,3,5,10,35};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    static void bubble (int[] arr){
        boolean swapped = false;
        for (int i=0; i<arr.length; i++ ){
            for (int j =0; j<arr.length-i-1; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    swapped =  true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    
}
