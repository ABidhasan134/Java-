import java.util.Scanner;
public class RotateInvert {
    public static void main(String args[])
    {
        int i,j;
       // System.out.println("hello");
       System.out.println("Enter the row number:");
       Scanner input =new Scanner(System.in);
       int row =input.nextInt();

       for(i=1;i<=row;i++)
       {
            for(j=1;j<=row;j++)
            {
                if(j<=row-i)
                {
                    /*
                     when i=1 j=1 j<=4-1 print space
                     when i=1 j=2 j<=4-1 print space
                     when i=1 j=3 j<=4-1 print space
                     when i=1 j=4 j!<=(not)4-1 go to the else

                     when i=2 j=1 j<=4-1 print space
                     when i=2 j=2 j<=4-1 print space
                     when i=2 j=3 j!<=(not)4-1 go to the else
                     */
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println("");
       }
    }
    
}
