import java.io.*;

public class FileDemo {
    public static void main(String[] args) {
        File f1 = new File("ourdata.txt");

        try {
            if (f1.createNewFile()) {
                System.out.println("File is Created...");
            } else {
                System.out.println("File is Available");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // f1.delete();

        boolean a = f1.canRead();
        if (a == true) {
            System.out.println("File having Read Permission..");
        } else {
            System.out.println("File Not Having rread permission...");
        }

        boolean b = f1.canWrite();
        if (b == true) {
            System.out.println("File having Wrie Permission");
        } else {
            System.out.println("File Not having Write Permission...");
        }

        boolean c = f1.canExecute();
        if (c == true) {
            System.out.println("File having execute Permission....");
        } else {
            System.out.println("File not having Execute Permission..");
        }

        boolean d = f1.exists();
        if (d == true) {
            System.out.println("File Already Available");
        } else {
            System.out.println("File is not Available");
        }
        boolean e = f1.isHidden();
        if (e == true) {
            System.out.println("File Is Hidden...");
        } else {
            System.out.println("File is not hidden...");
        }

        boolean f = f1.isFile();
        if (f == true) {
            System.out.println("It is File...");
        } else {
            System.out.println("It is not File...");
        }

        boolean g = f1.isDirectory();
        if (g == true) {
            System.out.println("It is Directory...");
        } else {
            System.out.println("It is not Directory...");
        }
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getPath());// its fetching file Name only...
        System.out.println(f1.getFreeSpace());
        System.out.println(f1.setExecutable(false));
        System.out.println(f1.lastModified());
        System.out.println(f1.listFiles());
        System.out.println(f1.getName());

    }
}