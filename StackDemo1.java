import java.util.*;

class StackDemo1 {
    public static void main(String[] args) {
        Stack st = new Stack();
        boolean b = st.empty();
        if (b == true) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack is Not Empty");
        }
        st.push(11); // inserting an element in the Stack
        st.push(22);
        st.push(33);
        st.push(44);
        st.push(11);
        st.push(22);
        System.out.println(st);
        st.pop(); // Deleting element form an Stack

        System.out.println(st);
        System.out.println("Searched Elemtn 11 form Stack");
        int n = st.search(11);// Search an elemnt form Stack and retive its position..
        System.out.println("Item Position::" + n);
        System.out.println(st);
        System.out.println("TOP Element of Stack::" + st.peek());

    }
}