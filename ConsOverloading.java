class ConsOverloading {
    int id;
    String name;
    int age;

    // Two Arguments..
    ConsOverloading(int i, String n) {
        id = i;
        name = n;
    }

    ConsOverloading(int i, String n, int e) {
        id = i;
        name = n;
        age = e;

    }

    // Three Arguments..
    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        // create objects and passing the values
        ConsOverloading s1 = new ConsOverloading(101, "Allen", 22);
        ConsOverloading s2 = new ConsOverloading(102, "Martin");
        // calling method to display the values of object
        s1.display();
        s2.display();
    }
}