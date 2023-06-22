public class Lpiramid {
public static void main (String[]args)
 {
    int i,j;
    /*
     n=1 *
     n=2 **
     n=3 ***
     n=4 ****
     */
    for(i=0;i<=4;i++)
    {
        for(j=0;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println(" ");
    }
 }     
}
