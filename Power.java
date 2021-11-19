import java.lang.Math;
import java.util.Scanner;

public class Power {
    double Pow;
    public void Powerint(Double a,Double b)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the of number and Power");
        a=s.nextDouble();
        b=s.nextDouble();
      //  System.out.println("Enter the of number and Power");
        Pow=Math.pow(a,b);
        System.out.println(Pow);
    }

    public static void main(String[] args) {
        Power obj=new Power();
        obj.Powerint(0.0,0.0);
    }

}
