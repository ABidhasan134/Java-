import java.util.Scanner;
public class Grading {
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Mark:");
        int mark= input.nextInt();
        if(mark>100 || mark<0)
        {
            System.out.println("your number is: "+ mark +"Error 404");
        }
        else if(mark<100 && mark>79)
        {
            System.out.println("Your number is:"+mark+"you got the A+");
        }
        else if(mark>69)
        {
            System.out.println("Your number is:"+mark+"you got the A");
        }
        else if(mark>59)
        {
            System.out.println("Your number is:"+mark+"you got the A-");
        }
        else if(mark>49)
        {
            System.out.println("Your number is:"+mark+"you got the B");
        }
        else if(mark>39)
        {
            System.out.println("Your number is:"+mark+"you got the c");
        }
        else if(mark<40 && mark>0)
        {
            System.out.println("Your number is:"+mark+"you got the Fail");
        }
        
        else{
            System.out.println("Error 404");
        }

    }
    
}
