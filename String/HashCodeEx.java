public class HashCodeEx {
    public static void main(String[] args) {
        String s1 = "Faizan ";
        System.out.println("Before Modification Simple String class HashCod::" + s1.hashCode());
        s1 = s1.concat("Hussain");
        System.out.println("After Concat Method apply on Simple String class HashCod ::" + s1.hashCode());

        StringBuffer sb = new StringBuffer("Faizan");
        System.out.println("Before Modification StringBuffer class HashCode ::" + sb.hashCode());
        sb.append("Hussain");
        System.out.println("Before Modification StringBuffer class HashCod ::" + sb.hashCode());
    }
}