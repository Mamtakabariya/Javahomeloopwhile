import java.util.Scanner;
public class Averagenumber01
{
    //global variable integer;
    static int a,b,c,d,e ;

    public static void average() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your first number");
        a =scanner.nextInt();
        System.out.println("enter your second number");
        b = scanner.nextInt();
        System.out.println("enter your third number");
        c = scanner.nextInt();
        System.out.println("enter your four number");
        d = scanner.nextInt();
        System.out.println("enter your five number");
        e = scanner.nextInt();


        int total = (a + b + c + d + e);
        System.out.println("average=" + total / 5);

    }
    public static void main(String[] args)
    {
        average();
    }

}
