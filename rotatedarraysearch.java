public class rotatedarraysearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 1, 2, 3, 4, 5};
        int target = 3;

        int index = search(arr, target);
        System.out.println("Target found at index: " + index);
    }

    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // Check if left half is sorted
            if (arr[start] <= arr[mid]) {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } 
            // Otherwise, right half must be sorted
            else {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1; // Target not found
    }
}