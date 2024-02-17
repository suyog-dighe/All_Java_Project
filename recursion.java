

public class recursion {
    public static void factorial(int n){
        if(n==1){
            System.out.println(n + " ");
            return;
        }

        System.out.println(n + " ");
        factorial(n-1);
//        int fact=factorial(n-1);
//        int fact1= n * factorial(n-1) ;
//
//        return fact1;

    }
    public static void main(String[] args) {
        int n=5;
       factorial(n);

    }
}
