import java.util.Scanner;

public class findpurmutation {
    public static void findp(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //recursion
        for (int i=0;i<str.length();i++){
            char curr = str.charAt(i);

            String newste = str.substring(0,i) + str.substring(i+1);
            findp(newste,ans+curr);


        }
    }
    public static void main(String[] args) {
       // String str="abc";
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str= sc.nextLine();
        findp(str," ");

    }
}
