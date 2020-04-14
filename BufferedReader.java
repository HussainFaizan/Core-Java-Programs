import java.io.*;

class BufferedReader {
	public static void main(String[] args) {
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Name::");
		String name = br.readLine();
		System.out.println("Name is::" + name);

	}
}