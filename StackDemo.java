import java.util.*;

class StackDemo {
    public static void main(String[] args) {
        Stack st = new Stack();
        boolean b = st.empty();
        if (b == true) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack is not Empty");
        }
        // System.out.println("Top=" + st.peek());
        // System.out.println(st.pop());
        st.push("C-language");
        st.push("Java");
        st.push("Python");
        st.push("PHP");
        st.push("Hadoop");
        st.push("AI");
        st.push(24);
        System.out.println(st);
        System.out.println("Top=" + st.peek());
        st.pop();
        st.pop();
        System.out.println("Top=" + st.peek());
        System.out.println(st);

        int n = st.search("PHP");
        System.out.println("POS=" + n);

    }
}