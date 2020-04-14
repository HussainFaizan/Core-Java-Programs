class RefDemo {
	public static void main(String args[]) {
		try {
			Class c = Class.forName(args[0]);
			System.out.println(c.getSuperclass());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

// javac RefDemo.java
// java RefDemo AdvCalc
// java.awt.Label