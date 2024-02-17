package dighe;
import java.util.Scanner;
public class largest_no {
    public static void main(String[] args) {
        System.out.println("enter the three number ");
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        a=sc.nextInt();
        System.out.println("enter the second number");
        b=sc.nextInt();
        System.out.println("enter the third number");
        c=sc.nextInt();
        int result;
        if(a>=b && a>=c)
        {
            result=a;
        }
        else if (b>=c)
        {
            result=b;

        }
        else
        {
            result=c;
        }
        System.out.println("greater number is " +result);
    }
}
