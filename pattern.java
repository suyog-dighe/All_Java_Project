import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {

        // 1st
      /*  int i;
        for(i=1;i<=6;i++){
            for(int j=1;j<=6;j++){
                if(i==1 ||  j==1 || i==6 || j==6){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // 2nd

       int i;
       for(i=0;i<9;i++){
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
       }

       //3rd

        int i;
        for(i=9;i>=1 ;i--){
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        //4th
        int i;
        int n=4;
        for(i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){

                System.out.print(" ");
                }
            for( int k=1;k<=i;k++){
                System.out.print("*");

            }
            System.out.println();
        }

        //5th
        int i,n=6;
        for(i=n;i>1;i--){
            for(int j=1;j<i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //6th
        int i,n=6;
        for(i=1;i<n;i++){
            for(int j=1;j<n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //7th
        int i,n=5;
        int no=1;
        for(i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(no+" ");
                no++;
            }
            System.out.println();
        }

        //8th
        int i,n=5;

        for(i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum %2==0){
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }

            }
            System.out.println();
        }

        //9th
        int i,n=5;
        char ch='A';
        for(i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;

            }
            System.out.println();
        }


        //10th
        int i,n=5;
        for(i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //numbers
            for (int k=1;k<=i;k++){
                System.out.print(i +" ");
            }
            System.out.println();
        }

       */
        //11th
        int i;
        int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        for(i=2;i<n-1;i++) {
            if (n % i == 0) {
                flag =0;
                System.out.println("not prime");
                break;
            }



        }
        flag =1;
        System.out.println("prime");


    }
}
