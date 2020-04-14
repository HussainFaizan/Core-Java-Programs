import java.io.*;

class DataInputStreamDemo {
	public static void main(String args[]) {
		try {
			DataInputStream dis = new DataInputStream(System.in);
			int ch;
			while ((ch = dis.read()) != '$') {
				System.out.print((char) ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
