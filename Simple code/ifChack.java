import java.util.*;

public class ifChack{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age:");
        int age=sc.nextInt();
        System.out.println("the age is "+age);
        if(age>18)
        {
            System.out.println("Adult " +age);
        }
        else
        {
            System.out.print("Not Adult " +age);
        }
    }
}