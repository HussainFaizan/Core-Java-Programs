import java.io.*;

class FileCopyDemo {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("ourdata.txt");
            FileOutputStream fos = new FileOutputStream("faizaninfo.txt");

            int ch = 0;
            while ((ch = fis.read()) != -1) {
                fos.write((char) ch);

            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}