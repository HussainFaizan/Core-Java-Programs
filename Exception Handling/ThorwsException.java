
public class ThorwsException {
    public static void main(String[] args) {
        int age = 10;
        if (age < 18)
            throw new ArithmeticException("Not valid age");
        else
            System.out.println("Welcome to Vote");

    }
}
