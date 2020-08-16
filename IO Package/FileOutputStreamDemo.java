import java.io.FileOutputStream;

public class FileOutputStreamDemo {
    public static void main(final String[] args) {
        try {
            final FileOutputStream fout = new FileOutputStream("Demo.txt");
            fout.write(65);
            fout.close();
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
}