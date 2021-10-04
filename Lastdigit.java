if the given numbers are 267 and 154, the output should be 11.
Below it the explanation-
Lat digit of the 267 is 7
Last digit of the 154 is 4
Sum of 7 and 4 = 11

Write a program to help rohit achieve this for any given two numbers.
 */
public class Lastdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        //int K, M;
        System.out.println(N1);
        int K = N1%10;
        System.out.println(K);
        System.out.println(N2);
        int M = N2%10;
        System.out.println(M);
        int sum = K+M;
        System.out.println(sum);

    }

}
