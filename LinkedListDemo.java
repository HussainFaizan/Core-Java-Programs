import java.util.LinkedList;

class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();// GENRIC Linked List
        ll.add("CSE");// To add Element in the Linked List...
        ll.add("MCA");
        ll.add("ECE");
        ll.add("M.TECH");
        ll.add("CIVIL");
        System.out.println(ll);
        ll.add("IT");// Add Element in linked list....
        System.out.println("After Adding an Element in the Linked list");
        System.out.println(ll);// To print all the element in the linked list...

        LinkedList<String> al = new LinkedList<String>();
        al.add("Faizan");
        al.add("Naresh");
        al.add("BalaKrishna");
        System.out.println(al);

        ll.addAll(3, al);// To add all the element form ll into al merge at position. 3....
        System.out.println(ll);
        ll.addFirst("CSE");// Add First element
        ll.addLast("MCA");// add last elelemtn in linked list...
        System.out.println(ll);
        // ll.clear();// Its Removes all the elements of the linked list..
        // System.out.println(ll);

        boolean b = ll.contains("ECT");
        if (b == true) {
            System.out.println("Object is Avaliable");
        } else {
            System.out.println("Object is not found...");
        }
        System.out.println("First ELement is ::" + ll.element());// TO get first elemnt in the linked list
        System.out.println("First ELement is ::" + ll.getFirst());// same
        System.out.println("First ELement is ::" + ll.peek());// same
        System.out.println(ll);
        System.out.println("First ELement is ::" + ll.poll());// slelect first elemtn form an linked list and remove..
        System.out.println(ll);
        System.out.println("Find Index postion ::" + ll.indexOf("MCA"));// To retrive the index of the element..
        System.out.println(ll);

    }
}