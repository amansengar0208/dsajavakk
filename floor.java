public class floor {
    // return the index : greatest <= target
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,16,26,31,40};
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
            System.out.println(end);
        }
    }
    
}
