 import java.util.Scanner;

public class UpperLowercase01 {
    public static void main(String[] args) {
        char ch, ch2;  // ch represent character B or a as a value
                Scanner scanner = new Scanner(System.in);
        System.out.println(("Enter Alphabet in upper case please:"));
         ch = scanner.nextLine().charAt(0);

        if(ch>='A' && ch <='z') //
        {
            ch2 =Character.toLowerCase(ch);
            System.out.println("converted to lowercase" + ch2);

        }
        else
        {
            ch2 = Character.toUpperCase(ch);
            System.out.println("converted to uppercase:" + ch2);
        }


    }
}