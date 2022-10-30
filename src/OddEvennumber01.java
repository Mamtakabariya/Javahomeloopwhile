import java.util.Scanner;

public class OddEvennumber01
{
    // global variable integer
    static int number;
    public static void main(String [] args)
    {
        //statement for user input
        System.out.println("enter any number\t");
        // importing scanner class for object
        Scanner scanner = new Scanner(System.in);
        number=scanner.nextInt();

        // condition to find number is even or odd using ternary operator.
        String a =(number%2==0)?"Even" : "Odd";

        //output
        System.out.println("number is  "+a);
    }
}
