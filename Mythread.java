class Mythread extends Thread {
    public void run() {
        System.out.println("Thread Created....");
    }

    public static void main(String[] args) throws Exception {
        Mythread mt = new Mythread();
        Thread t = new Thread(mt);

        t.start();
    }
}