import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        int count = 0;
        Pattern p = Pattern.compile("ab");
        Matcher m = p.matcher("ababbaba");
        // System.out.println("Starting Index..........Ending Index...........Index
        // Group.");
        while (m.find()) {
            count++;
            // System.out.println(m.start());

            System.out.println(m.start() + "..........." + m.end() + "..........." + m.group());
        }
        System.out.println("The Total number of string occurance is:: " + count);
        ;
    }
}