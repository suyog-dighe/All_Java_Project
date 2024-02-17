package dighe;
import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int r;
        r=sc.nextInt();
        double peri;
        double area;
        peri=Math.PI*2*r;
        area=Math.PI*r*r;
        System.out.println("perimetre is the " +peri);
        System.out.println(area);
    }
}
