class parameterizedConst {
    int id;
    String name;

    // parameterized constructor
    parameterizedConst(int i, String n) {
        id = i;
        name = n;
    }

    // method to display the values
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        // create objects and passing the values
        parameterizedConst s1 = new parameterizedConst(101, "Allen");
        parameterizedConst s2 = new parameterizedConst(102, "Martin");
        // calling method to display the values of object
        s1.display();
        s2.display();
    }
}