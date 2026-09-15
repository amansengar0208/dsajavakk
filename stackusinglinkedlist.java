import java.util.*;

public class stackusinglinkedlist {

    private Node top;
    private int size;

    private class Node {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public stackusinglinkedlist(){
        this.top=null;
        this.size=0;
    }


    public void push(int data) {   
        Node newNode = new Node(data);
        newNode.next=top;
        top = newNode;
        size++;
    }

        public void display() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }
        Node current = top;
        System.out.print("Stack (Top -> Bottom): ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {

        stackusinglinkedlist stack = new stackusinglinkedlist();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.display();
        
    }
}
