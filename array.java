import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] arr = new int[5];
        for (int i = 0; i<arr.length; i++){
            System.out.print("Enter num " + i + " : ");
            arr[i]=sc.nextInt();
        }

        for (int i=0; i<arr.length; i++){
            System.out.println("array elements "+i+" :" + arr[i]);
        }
    }
}
