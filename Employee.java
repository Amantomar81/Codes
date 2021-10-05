import java.util.Scanner;

public class Employee {
    public int eid;     //instance variable.
    public String ename;    //instance variable.
    Employee()      //it is a normal method
    {
        eid = 30;
        ename = "pawan";
    }
    Employee(int a,String b)
    {
        eid = a;
        ename = b;
    }
    public void setvalue()
    {
        Scanner s = new Scanner(System.in);
        eid = s.nextInt();
        ename = s.nextLine();
    }
    public void show()
    {
        System.out.println(eid+ "\t" + ename);
    }
}   //end of the class


//execution class
class EmployeeMain
{
    public static void main(String[] args) {
        Employee o1 = new Employee();
        Employee o2 = new Employee(23, "aman");

        o1.show();
    }
}
