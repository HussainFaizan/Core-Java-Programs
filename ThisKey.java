class ThisKey {
    int id;
    String name;

    ThisKey(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        ThisKey th1 = new ThisKey(101, "About");
        ThisKey th2 = new ThisKey(102, "Java");
        th1.display();
        th2.display();
    }
}