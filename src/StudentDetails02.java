import java.util.Scanner;
public class StudentDetails02{
    //global variable integer;
    static int maths, english,physics;
    static int percentage;
    static int total;
    static int rollnumber;
    static String name;
    public void logic()
    {
        total=maths+english+physics;
        percentage=total/3;
    }
    public void calculator()
    {
        logic();
        System.out.println("marks = "+total+ "percentage="+percentage);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your name");
        name=scanner.next();

        System.out.println("enter your rollnumber");
        rollnumber=scanner.nextInt();

        System.out.println("enter your maths marks");
        maths=scanner.nextInt();

        System.out.println("enter your english marks");
        english= scanner.nextInt();
        System.out.println("enter your physics marks");
        physics= scanner.nextInt();

        StudentDetails02 studentDetails =new StudentDetails02();
        studentDetails.logic();
        studentDetails.calculator();

        if(percentage>=80){
            System.out.println("you successfully passed exam with A+ grade");}

        else if (percentage>=60){
            System.out.println("you are successfully passed exam with grade"+"A");}

        else if (percentage>=50){
            System.out.println("you are successfully passed exam with Grade"+"B");}

        else if (percentage>=35){
            System.out.println("you are successfully passed exam with Grade"+"c");}
        else if (percentage>=35){

            System.out.println("you are pass");}
        else{
            System.out.println("you are failed in exam");
        }
    }


}


