import java.util.Scanner;
public class dimondPettern {
    public static void main (String []args)
    {
        System.out.println("how many line you want to print:");
        int n;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();

        //UPPER HAFE
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=n-i;j++)
            {
                //space only print in left side not both side(if we sapous 0=space)
                //000*
                //00***
                //0*****

                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++)
            {
                // when i=1 j=1 then 2*1-1=1
                //when i=2 j=
                System.out.print("*");
            }
            System.out.println("");
        }
        //LOWER HAFE
        for(int i=n;i>=1;i--)
        {
            for(int j=0;j<=n-i;j++)
            {
                //space only print in left side not both side(if we sapous 0=space)
                //000*
                //00***
                //0*****

                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++)
            {
                // when i=1 j=1 then 2*1-1=1
                //when i=2 j=
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
