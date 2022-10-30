import java.util.Scanner;
public class LeapYear02
{
    public static void main(String [] args)
    {
        int y;
        System.out.println("enter any year");
        Scanner scanner = new Scanner(System.in);
        y= scanner.nextInt();

        if(y%100==0 && y % 400 == 0 || y % 100 != 0 && y % 4== 0)
        {
            System.out.println("leap year");

        } else System.out.println("not a leap year");

    }
}


