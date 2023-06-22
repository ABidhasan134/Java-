public class uperTringel01 {
    
    public static void main(String[] args) {
        int rows = 4; // Number of rows in the pattern

        for (int i = rows; i >= 1; i--) {
            // Print spaces before the numbers
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            // Print numbers in decreasing order
            for (int k = 1; k <= i; k++) {
                if((j+i) %2==0){
                    System.out.println("0");
                }else{
                    System.out.println("1");
                }
                //System.out.print(k +" ");
            }

            System.out.println(); // Move to the next line
        }
    }
}
