import java.util.Scanner;

public class InterChanged01 {


    //global variable integer;

    public static void main(String [] args)
    {
        int x,y,z;
        Scanner in = new Scanner(System.in);
        System.out.println("int the first number ");
        x =in.nextInt();

        System.out.println("int the second number");
        y = in.nextInt();

        z = x;
        x = y;
        y = z;

        System.out.println("Swapped values are 3" + x + "and" +y);

    }
}

