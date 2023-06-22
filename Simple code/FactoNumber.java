
import java.util.Scanner;
public class FactoNumber {
    public static void main(String[]args)
{
    int fecto=1;
    System.out.print("Enter any number:");
    Scanner input = new Scanner(System.in);
    int n=input.nextInt();
    for(int i=1;i<=n;i++)
    {
        fecto=fecto*i;
    }
    System.out.println(""+fecto);
}
    
}
