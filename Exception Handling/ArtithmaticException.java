class ArithmaticException {
    public static void main(String[] args) {

        try {
            int a = 100 / 0;
            System.out.println(a);

        } catch (Exception e) {
            // TODO: handle exception
            // System.out.println(e);
            e.printStackTrace();
        }
    }
}