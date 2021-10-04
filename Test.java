// using switch case

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
//        if (button==1){
//            System.out.println("Hello");
//        }
//        else if (button==2){
//            System.out.println("Namste");
//        }
//        else if (button==3){
//            System.out.println("Aman");
//        }
//        else{
//            System.out.println("invalid button");
        switch(button){
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("Namste");
            break;
            case 3 : System.out.println("Aman");
            break;
            default:
                System.out.println("invalid button");
        }
        }
   }
