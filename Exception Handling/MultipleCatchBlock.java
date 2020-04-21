
public class MultipleCatchBlock {
    public static void main(String[] args) {
        try {
            int a = 100 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception");
        } catch (NullPointerException e) {
            System.out.println("NullPointerExccption");
        }
    }
}