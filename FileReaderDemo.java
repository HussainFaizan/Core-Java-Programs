import java.io.FileReader;
import java.io.*;

class FileReaderDemo {
    public static void main(String[] args) throws Exception {
        FileReader r = new FileReader("Hello.java");
        int ch;
        while ((ch = r.read()) != -1) {
            System.out.print((char) ch);
            Thread.sleep(300);

        }
        r.close();
    }
}
