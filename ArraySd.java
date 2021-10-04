/*
Wap to input N elements in an array & find standard deviation
 */
import java.util.Scanner;
import java.lang.Math;
public class ArraySd
{
    double sd(int arr[],int n,float avg)
    {
        double sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=Math.pow(arr[i]-avg,2);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        int sum=0;
        System.out.println("Enter the array the elements:");
        for (int i = 0;i<N;i++)
        {
            A[i] = sc.nextInt();
           // System.out.println(A[i]);
            sum = sum + A[i];
        }
        float avg = (float)sum/N;

        ArraySd obj = new ArraySd();
        double s = obj.sd(A,N,avg);
        double v = s/N;
        System.out.println(Math.sqrt(v));
    }
}
