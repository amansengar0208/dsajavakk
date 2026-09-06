public class searchin2darray {
    public static int[] searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{-1, -1};
        }

        // Pointer 1: Start at the first row
        int row = 0;
        // Pointer 2: Start at the last column (Top-Right Corner)
        int col = matrix[0].length - 1;

        // While both pointers stay within matrix boundaries
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col}; // Target found
            } 
            else if (matrix[row][col] > target) {
                col--; // Move left to find smaller numbers
            } 
            else {
                row++; // Move down to find larger numbers
            }
        }

        return new int[]{-1, -1}; // Target not found
    }

    public static void main(String[] args) {
        // Rows and Columns are independently sorted
        int[][] matrix = {
            {1,   4,  7, 11},
            {2,   5,  8, 12},
            {3,   6,  9, 16},
            {10, 13, 14, 17}
        };
        int target = 5;

        int[] result = searchMatrix(matrix, target);
        System.out.println("Coordinate: [" + result[0] + ", " + result[1] + "]"); 
        // Output: Coordinate: [1, 1]
    }
}
