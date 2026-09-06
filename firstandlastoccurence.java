import java.util.Arrays;

public class firstandlastoccurence {    
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = findFirst(nums, target);
        if (ans[0] == -1) {
            return ans; // target does not exist, no need to search last
        }
        ans[1] = findLast(nums, target);

        return ans;
    }

    private static int findFirst(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] >= target) {
                if (nums[mid] == target) {
                    index = mid;     // Record match
                }
                end = mid - 1;       // Continue searching left
            } else {
                start = mid + 1;     // nums[mid] < target, search right
            }
        }

        return index;
    }

    private static int findLast(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] <= target) {
                if (nums[mid] == target) {
                    index = mid;     // Record match
                }
                start = mid + 1;     // Continue searching right
            } else {
                end = mid - 1;       // nums[mid] > target, search left
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5};
        int target = 3;

        int[] result = searchRange(nums, target);
        System.out.println(Arrays.toString(result)); 
        // Output: [3, 5]
    }
}