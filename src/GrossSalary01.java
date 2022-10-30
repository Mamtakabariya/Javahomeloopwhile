
import  java.util.Scanner;
public class GrossSalary01
{
    // global variable integer;
    static int basicsalary,hra,da,pf,ta,gp;
    public static void main(String[] args) {
        int grosssalary = basicsalary + hra + da + pf + ta + gp;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the employeeid");
        String employeeid = scanner.next();
        System.out.println("enter the name of employee");
        String name = scanner.next();

        System.out.println("enter the basicsalary");
        basicsalary = scanner.nextInt();

        System.out.println("enter the grosssalary");
        grosssalary = scanner.nextInt();

        System.out.println("id " + "employeename = " );
        System.out.println("gross salary = " + gp);
        int da = basicsalary * 8 / 100;
        int hra = basicsalary * 10 / 100;
        int pf = basicsalary * 20 / 100;
        int ta = basicsalary * 9 / 100;
        int gp = basicsalary + hra + pf + da + ta;
    }
}


