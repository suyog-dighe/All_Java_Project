import java.sql.SQLOutput;

public class patternpractise {
    public static void main(String[] args) {
        int a=8;

        for(int i=0;i<=a-1;i++){
            for(int j=0;j<=i;j++){

                System.out.print(" ");
            }
            for(int k=1;k<=a-i;k++){
                System.out.print("*"+"");
            }

            System.out.println();
        }
    }
}
