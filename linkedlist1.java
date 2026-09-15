import java.util.LinkedList;

public class linkedlist1 {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();

        //insertion

        list1.add(0, "Aman");
        list1.add(1, "Abhineet");
        list1.add(2, "Mukund");
        list1.add(3, "Vaibhav");
        list1.add(4, "AmanRai");

        System.out.print("Before : ");
        System.out.println(list1);

        //updatation

        list1.set(4, "Abhinav");

        System.out.print("After insertion : ");
        System.out.println(list1);

        //deletion

        list1.remove(0);
        System.out.print("After deletion : ");
        System.out.println(list1);

        //iteration

        for (int i =0; i<list1.size(); i++){
            System.out.println(list1.get(i) + " ");
        }

        System.out.println();



    }

    
}
