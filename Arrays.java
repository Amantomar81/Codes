//sum of  array elements.

import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        System.out.println("Enter array elements:");
     //Input
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();

            sum = sum+arr[i];
            //Output
           /* for (int i =0;i<arr.length;i++){
                 System.out.println(arr[i]);
            }*/
        }
        System.out.println("sum is: "+sum);
    }
}
