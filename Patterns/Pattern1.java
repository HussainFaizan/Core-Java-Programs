/* Pattern 1
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

*/

class Pattern1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // row
            for (int j = 1; j <= i; j++) { // col
                if ((i + j) % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println("");
        }
    }
}