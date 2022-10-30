import java.util.Scanner;

public class StudentResults01 {
    //global variable integer;
    static int maths, science, physics;
    static int rollnumber;
    static String name;


    public static void main(String[] args) {
        //local variable of main method = no one else can access outside the main method
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");
        name = scanner.next();

        System.out.println("enter your rollnumber");
        rollnumber = scanner.nextInt();

        System.out.println("enter your maths marks");
        maths = scanner.nextInt();
        System.out.println("enter your science marks");
        science = scanner.nextInt();
        System.out.println("enter your physics");
        physics = scanner.nextInt();

        if ((maths >= 35) && (science >= 35) && (physics >= 35))
        {
            System.out.println("you are pass");
        } else {
            System.out.println("you are fail");
        }
        ;
        }
    }

