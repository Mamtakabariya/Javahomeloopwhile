import java.util.Scanner;
public class Positivenagativenumber {
    //global variable integer
    int positivenumber;
    int nagativenumber;
    int zeronumber;

    public static void main(String[] args) {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        number = scanner.nextInt();


        System.out.println(number + "is positive number");
        int positive = scanner.nextInt();

        {
            System.out.println(number + "is nagative number");
            int nagtive = scanner.nextInt();
        }


            System.out.println(number + "is zeronumber");
            int zero = scanner.nextInt();
            if (number>0)
            {
                System.out.println("number is positive");
            } else if (number<0) {

                System.out.println("number is nagative");
            }
            else {
                System.out.println("number is zero");
            }
    }
}