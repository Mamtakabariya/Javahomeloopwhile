import java.util.Scanner;
public class PosiiveNagative
{
    static int number;
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number please");
        int number = scanner.nextInt();

        if (number>0){
            System.out.println("given number is positive");
        }else if (number<0){
            System.out.println("given number is nagative");

        } else if ( number==0){
            System.out.println("given number is zero");
        } else
            System.out.println("invalid input");

    }

}
