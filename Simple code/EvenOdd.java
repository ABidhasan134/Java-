import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[])
    {
        int number;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number: ");
        number=input.nextInt();
        if( number%2==0)
        {
            System.out.println("Even number="+number);
        }
        else{
            System.out.println("Odd number="+number);
        }
    }    
}
