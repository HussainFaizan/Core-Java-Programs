
import java.io.*;

class FileOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("Faizaninto.txt");
            DataInputStream dis = new DataInputStream(System.in);
            int ch = 0;
            while ((ch = dis.read()) != '$') {
                fos.write((char) ch);

            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}