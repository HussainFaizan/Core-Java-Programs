import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Hi my name is Faizan Hussain");
        System.out.println("String Count String Tokenizer ::" + st.countTokens()); // To count the all the string
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken()); // next token mehtod is used to next the token print
        }
    }
}