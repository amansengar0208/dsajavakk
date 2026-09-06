import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");

        String firstfruit = fruits.get(0);
        System.out.println(firstfruit);
    }
}
