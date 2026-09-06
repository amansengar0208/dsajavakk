public class evenszie {
    public static void main(String[] args) {
        int[] arr = {10,20,133,40,50};
        int count =0;
        for (int i=0; i<arr.length; i++){
            if (String.valueOf(arr[i]).length()%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
