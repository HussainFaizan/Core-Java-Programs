class Activa4G {

    void Bikeinfo(int mil, String model, double price) {
        System.out.println("Super class Method");
        System.out.println("Mil::" + mil);
        System.out.println("Model::" + model);
        System.out.println("price::" + price);
    }
}

class Activa5G extends Activa4G {

    void Bikeinfo(int mil, String model, double price) {
        System.out.println("Sub class Method");
        System.out.println("Mil::" + mil);
        System.out.println("Model::" + model);
        System.out.println("price::" + price);
    }
}

class MethodOverriding {
    public static void main(String[] args) {
        Activa5G c1 = new Activa5G();
        c1.Bikeinfo(45, "Activa 5G", 90000);

        Activa4G c2 = new Activa5G();
        c2.Bikeinfo(35, "Activa 4G", 80000);

    }
}