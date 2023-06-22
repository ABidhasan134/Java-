public class Rever01 {

    public static void main(String[] args) {
        int n = 4;
        int i, j;
        for (i = n; i >= 0; i--) {
            for (j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < i; j++) {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}
