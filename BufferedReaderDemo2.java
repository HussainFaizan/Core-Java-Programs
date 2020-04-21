import java.io.Reader;
import java.io.*;

class BufferedReaderDemo2 {
    public static void main(String[] args) {
        try (java.io.BufferedReader br = new java.io.BufferedReader(new Reader(System.in))) {

        } catch (Exception e) {

            // java.io.BufferedReader br = new java.io.BufferedReader(new
            // InputStreamReader(System.in));
            System.out.println("Enter Employee Age");
            int age = Integer.parseInt(br.readLine());
            System.out.println("Employee Age::" + age);
            // TODO: handle exception
        }

    }
}