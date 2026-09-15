import java.util.Arrays;

public class selection {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        selection2(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selection2(int[] arr){
        for (int i=0; i<arr.length; i++){
            int last = arr.length-i-1;
            int maxi = maxindex(arr, 0, last);
            exc(arr, maxi, last);
            
        }
    }

    static int maxindex(int[] arr, int start, int last){
        int max = start;
        for (int i=start; i<=last; i++){
            if (arr[i]>arr[max]);
            max=i;

        }
        return max;
    }

    static void exc (int[] arr, int start, int last){
        int temp  = arr[start];
        arr[start]=arr[last];
        arr[last]= temp;
    }
}