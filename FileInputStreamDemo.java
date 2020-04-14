
import java.io.FileInputStream;

public class FileInputStreamDemo {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("ourdata.txt");
            int ch = 0;
            while ((ch = fin.read()) != -1) {
                System.out.print((char) ch);
            }
            fin.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}