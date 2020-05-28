public class ImmutableDemo {
    public static void main(String[] args) {
        String str = "Faizan";
        str.concat("Hussain");
        System.out.println(str); // will print Faizan because strings are immutable objects
    }
}