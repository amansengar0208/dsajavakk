public class binarysearch {
    
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        int target = 30;
        int start = 0;
        int end = arr.length - 1;
        boolean found = false;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1; // Search right half
            } else {
                end = mid - 1;   // Search left half
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}