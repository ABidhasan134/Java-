import java.util.Scanner;

public class ArrayMulti {
    public static void main(String args[])
    {
        int a[][],b[][],c[][];
        a= new int [3][3];
        b =new int [3][3];
        c= new int [3][3];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1st Matrix:");
        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=2;j++)
            {
                a[i][j]=input.nextInt();

            }
            
        }
        System.out.println("Enter 2nd Matrix:");
        for(int i=0;i<=2;i++ )
        {
            for(int j=0;j<=2;j++)
            {
                b[i][j]=input.nextInt();
            }
        }


        // here is 
        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=2;j++)
            {
                c[i][j]=0;
                for(int k=0;k<=2;k++)
                {
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }
        }
       
        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=2;j++)
            {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println(" ");
        }
     
    }
}

