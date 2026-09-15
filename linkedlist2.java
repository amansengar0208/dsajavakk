import java.util.LinkedList;

public class linkedlist2 {
    public static void main(String[] args) {
        LinkedList<Integer> list2 = new LinkedList<>();

        list2.add(0, 10);
        list2.add(1, 20);
        list2.add(2, 30);
        list2.add(3, 40);
        list2.add(4, 50);

        //display
        
        System.out.print("Display : ");
        System.out.println(list2);


        //count

        int count =0;

        for (int i =0; i<list2.size(); i++){
            count++;
        }

        System.out.print("Count : ");
        System.out.println(count);

        //mid

        int item = 30;

        int start =0;
        int end = list2.size();

        int mid = start + (end - start)/2;

        System.out.print("Mid element : ");
        System.out.println(list2.get(mid));

        // saerch

        while (start<end) {
            int mid2 = start+(end - start)/2;
            if (list2.get(mid2)==item){
                System.out.println("Item at index : " + mid2);
                break;
            }
            else if (list2.get(mid2)>item){
                start= mid2+1;
            }
            else{
                end = mid2-1;
            }
        }



    }
}
