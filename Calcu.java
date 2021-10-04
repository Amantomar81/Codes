// calculator by using switch case
import java.util.Scanner;

public class Calcu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        switch (x){
            case 1 : System.out.println(a+b);
                break;
            case 2: System.out.println(a-b);
                break;
            case 3: System.out.println(a*b);
                break;
            case 4 : System.out.println(a/b);
                break;
            case 5 : System.out.println(a%b);
            break;
            default:
                System.out.println("invalid value");
        }
    }
}
