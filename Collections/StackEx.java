import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<String> st = new Stack<String>();
        boolean b = st.empty();
        if (b == true) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack is not Empty");
        }
        st.push("Faizan");
        st.push("Hussain");
        st.push("Parvez");
        st.push("Hussain");
        System.out.println(st);
        int n = st.search("Parvez");
        System.out.println(n);
    }
}