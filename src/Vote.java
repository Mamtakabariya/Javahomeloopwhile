import java.util.Scanner;

public class Vote
{
    static int age;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println('\n');
        System.out.println("enter your age please");
        age = scanner.nextInt();

        if( age>=18){
            System.out.println("congratulation"+ "you are eligible is vote");
        } else {
            System.out.println("you are not eligible to vote");
        }
}
