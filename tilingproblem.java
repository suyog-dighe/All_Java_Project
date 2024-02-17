import java.util.Scanner;
import java.util.*;


public class tilingproblem {
    //tiling problem find the way to how you set the tiling on floor
//    public static int tiling(int n){
//        if(n==0 || n==1){
//            return 1;
//
//        }
//
//       int fnm1=tiling(n-1);
//        int fnm2=tiling(n-2);
//        int fn=fnm1 + fnm2;
//        return fn;
//
//    }

//    public static void removeduplicate(String str,int idx,StringBuilder newstr,boolean map[]){
//        if(idx==str.length()){
//            System.out.println(newstr);
//            return;
//        }
//        char curre = str.charAt(idx);
//        if(map[curre-'a']==true){
//            removeduplicate(str,idx+1,newstr,map);
//        }
//        else {
//            map[curre-'a']=true;
//            removeduplicate(str,idx+1,newstr.append(curre),map);
//
//        }
//    }
    public static void printstring(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printstring(n-1,0,str+"0");
        if (lastplace==0){

            printstring(n-1,1,str+"1");
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the String which you want to remove :");
       int  n=sc.nextInt();
//        System.out.println("you are finding the ways is : "+tiling( n) + " that much ");
        //String str ="appnnacollege";
        //removeduplicate(n,0,new StringBuilder(""), new boolean[26]);
        printstring(n,0,"");
    }

}
