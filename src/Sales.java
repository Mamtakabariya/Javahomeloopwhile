import java.util.Scanner;
public class Sales
{
    //global variable integer
String name;
String id;
String amount;



    public static void main(String[] arg){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter sales id");
        String salesid=sc.next();

        System.out.println("enter sallersname");
        String sallersname  =sc.next();

        System.out.println("sales amount");
        String salesamount = sc.next();

        System.out.println("enter salary basic");
        String salarybasic =sc.next();

        System.out.println("enter sales commission");
        String salescommission =sc.next();

        System.out.println("id"+"sallername =");
        System.out.println("amount"+"basic"+"commission");



    }
}
