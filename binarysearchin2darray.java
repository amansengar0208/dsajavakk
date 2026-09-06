public class binarysearchin2darray {
    public static int[] searchMatrix(int[][] matrix, int target) {
        // 1. Boundary check for empty matrix
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{-1, -1};
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // 2. Treat the 2D matrix as a flat 1D array from index 0 to (total elements - 1)
        int start = 0;
        int end = (rows * cols) - 1;

        // 3. Standard Binary Search while loop
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            // Core Logic: Map the 1D mid index to 2D coordinates
            int r = mid / cols;
            int c = mid % cols;
            int currentElement = matrix[r][c];

            if (currentElement == target) {
                return new int[]{r, c}; // Target found! Return coordinates
            } else if (currentElement < target) {
                start = mid + 1; // Move right
            } else {
                end = mid - 1;   // Move left
            }
        }

        return new int[]{-1, -1}; // Target not found
    }

    public static void main(String[] args) {
        // Must be strictly sorted continuously
        int[][] matrix = {
            {1,   3,  5,  7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 3;

        int[] result = searchMatrix(matrix, target);
        System.out.println("Coordinate: [" + result[0] + ", " + result[1] + "]");
        // Output: Coordinate: [0, 1]
    }
}
