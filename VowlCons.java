import java.util.Scanner;

public class VowlCons {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch;
        ch = input.next().charAt(0);

        switch(ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println(ch + " is vowel");
            break;
            default:
            System.out.println(ch + " is consonant");

        }


    }
    
}
