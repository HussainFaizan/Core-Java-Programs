import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMetachar {
    public static void main(String[] args) {
        // Pattern p = Pattern.compile("\\s");
        // Pattern p = Pattern.compile("\\W");
        Pattern p = Pattern.compile("\\D");
        Matcher m = p.matcher("a7b @z#9");
        while (m.find()) {
            System.out.println(m.start() + "...." + m.group());
        }
    }
}