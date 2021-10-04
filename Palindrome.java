import java.util.Scanner;

public class Palindrome {

    //main method
    public static void main(String[] args) {

        //variables to be used in program
        int n,s=0,temp;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
       int x = sc.nextInt(); //it is the number variable to be checked for palindrome
        //reading a number id palindrome or not
        temp = x;
        while(x>0)
        //for (int i = 0 )
        {
            n = x%10; //finds remainder
            s = (s*10)+n;
            x = x/10;
        }

        if (temp == s)
            System.out.println("The given number is palindrome");
        else
            System.out.println("The given number is not palindrome");
    }
}
