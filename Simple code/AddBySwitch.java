import java.util.Scanner;
public class AddBySwitch {
    public static void main(String[]args)
    {
        System.out.print("Enter your 1st number:");
        Scanner input = new Scanner(System.in);
        int num1=input.nextInt();
        System.out.print("Enter your 2nd number:");
        int num2=input.nextInt();
        System.out.print("Enter opearetor: ");
        String opearetor=input.next();
        switch (opearetor) {
            case "+":
            {
                int num=num1+num2;
                System.out.println("the sum is: "+num);
                break;
            }
            case "-":
            {
                int num=num1-num2;
                System.out.println("the sum is: "+num);
                break;
            }
            case "*":
            {
                int num=num1*num2;
                System.out.println("the sum is: "+num);
                break;
            }
            case "/":
            {
                int num=num2/num2;
                System.out.println("the sum is: "+num);
                break;
            }
            default:
            System.out.println("this is not operator");
        }
    }
    
}
