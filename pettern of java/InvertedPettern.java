import java.util.Scanner;

public class InvertedPettern {
    public static void main(String args[])
    {
       int i,j;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the row number:");
        int n = input.nextInt();
    /*
     n=5 *****
     n=4 ****
     n=3 ***
     n=2 **
     n=1 *
     we are 1st row as 5th row here and decriment.coulom will start from 1 
     */
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
