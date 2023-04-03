package Linkedlist;

import java.util.Objects;

public class Test {
    private Node head;
    private int numNodes;
    public Test(Object data) {
        head = new Node(data);
    }
    private class Node {
        private Node next;
        private Object data;
        public Node(Object data) {
            this.data = data;
        }
        public Object getData() {
            return this.data;
        }
    }
//    public void add(int index, Object data){
//        Node temp = head;
//        Node holder;
//        for(int i = 0 ; i < index - 1 && temp.next != null; i++){
//            temp = temp.next;
//        }
//        holder = temp.next;
//        temp.next = new Node(data);
//        temp.next.next = holder;
//        numNodes++;
//    }

    public void add(int index,Object data){
        Node temp = new Node(data);
        temp.data = data;
        if(index == 1){
            temp.next = head;
            head = temp;
        } else {
            Node p = head;
            for(int i = 1; i < index -1; i++){
                p = p.next;
            }
            temp.next = p.next;
            p.next = temp;
        }

    }
    public  void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    public Node get(int index){
        Node temp = head;
        for(int i = 0 ; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        System.out.println();
        Test t1 = new Test(10);
        t1.addFirst(11);
        t1.addFirst(12);
        t1.addFirst(13);

        t1.add(4,9);

        t1.printList();
    }
}
