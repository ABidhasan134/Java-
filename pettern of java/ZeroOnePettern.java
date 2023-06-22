import java.util.Scanner;
public class ZeroOnePettern {
    public static void main(String args[])
    {
        //System.out.println("test the code:");
        System.out.println("Enter the row number:");
        Scanner input=new Scanner(System.in);
        int row =input.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    /*here we find the logic that every time if we add
                     i and j index value and it is positiv there are 1. Where i and 
                     j index value is negative than it is o */
                    /*
                        when i=1 j=1 i+j=2 than print 1
                        when i=2 j=2 i+j=4 than print 1
                    */ 
                    System.out.print("1");
                }
                else
                {
                    /*  when i=2 j=1 i+j=3 than print 0
                        when i=3 j=1 i+j=4 than print 0
                    */
                        System.out.print("0");
                }
            }
            System.out.println(" ");
        }

    }
    
}
