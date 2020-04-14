class InstanceVar {
    int x = 90;

    InstanceVar() {
        x++;
        System.out.println(x);
    }

    public static void main(String[] args) {
        InstanceVar obj1 = new InstanceVar();
        InstanceVar obj2 = new InstanceVar();
        InstanceVar obj3 = new InstanceVar();
        InstanceVar obj4 = new InstanceVar();
        InstanceVar obj5 = new InstanceVar();

    }
}