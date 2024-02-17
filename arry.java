import java.util.Scanner;
import  java.util.Arrays;
import java.util.Collections;

public class arry {
    /*
    public static int largest(int number[]) {
        int largest = Integer.MIN_VALUE;
       // System.out.println("enter the how many number you will enter");
       // Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
        //for(int j=0;j<n;j++) {
            for (int i = 0; i < number.length; i++) {
                if (largest < number[i]) {
                    largest = number[i];
                }
            }
        //}
        return largest;

    }

     */
    public static void display(int number[]){
        for(int i=0;i<number.length;i++){
            System.out.print(number[i] +" ");
        }
        System.out.println();
    }
    public static void display1(Integer number1[]){
        for(int i=0;i<number1.length;i++){
            System.out.print(number1[i] +" ");
        }
        System.out.println();
    }
        public static void  countingsort(int arr[]){
        int largest= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int[largest +1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
            for(int i=0; i< count.length;i++){
                while (count[i] >0){
                    arr[j]= i;
                    j++;
                    count[i]--;

                }

            }
        }


    public static void main(String[] args) {
        int number[] = {1,2,5,3,9,6,5,6,8,4,2,4,8};
         //Integer number1[] = {1,2,5,3,9,6,4,8};
        //Arrays.sort(number);
        //System.out.println(" " + number);
        //display(number);
        //Arrays.sort(number1,Collections.reverseOrder());
       // display1(number1);
        countingsort(number);
        display(number);

    }
}
