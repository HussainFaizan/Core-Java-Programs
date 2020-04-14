import java.io.*;

class BufferedReaderDemo {
    public static void main(String[] args) {
        try {
            java.io.BufferedReader br = new java.io.BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter Employee ID::");
            int eid = Integer.parseInt(br.readLine());

            System.out.println("Enter Employee Name");
            String str = br.readLine();

            System.out.println("EmpID::" + eid);
            System.out.println("Employee Name::" + str);

        } catch (Exception e) {
            e.printStackTrace();
            // System.out.println(e);
        }
    }
}
