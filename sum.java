public class sum {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        // Loop through the array to calculate sum
        for (int num : numbers) {
            sum += num;
        }

        // Calculate average (cast to double for decimal accuracy)
        double average = (double) sum / numbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
