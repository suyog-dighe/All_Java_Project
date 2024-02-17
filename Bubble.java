

import java.util.Scanner;

public class Bubble {

    public static void bubblesort(int arr[]){
        for (int i=0;i< arr.length-1;i++){
            for (int j=0;j< arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
    }
//    public static void takeinput(){
//        System.out.println("enter the number how many input you are taken :");
//        Scanner sc=new Scanner(System.in);
//        int n =sc.nextInt();
//        int arr[]=new int[n];
//        System.out.println("enter the array number :");
//        for (int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//
//    }

    public static void printarr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //int arr[]={1,5,7,8,3};
//       int arr[] = new int[0];
//        takeinput();
        System.out.println("enter the number how many input you are taken :");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array number :");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }


        bubblesort(arr);
        printarr(arr);

    }
}





