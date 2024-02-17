import java.util.Scanner;

public class mergesort {

    public static void merge(int a[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        merge(a,si,mid);
        merge(a,mid+1,ei);

        mergefun(a,si,mid,ei);

    }
    public static void mergefun(int a[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while (i<=mid && j<=ei){
            if (a[i] < a[j]){
                temp[k]=a[i];
                i++;
            }
            else {
                temp[k]=a[j];
                j++;
            }
            k++;
        }
        while (i<=mid){
            temp[k++]=a[i++];
        }

        while (j<=ei){
            temp[k++]=a[j++];
        }
        for (k=0, i=si; k<temp.length;k++,i++ ){
            a[i]=temp[k];
        }
    }
    public static void print(int a[]){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //int arr[]={2,6,4,8,7,9};

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number ");
       int  s=sc.nextInt();
        int c[]=new int[s];
        System.out.println("Enter the element of arry");
       for(int a=0;a<s;a++){

           c[a]=sc.nextInt();
       }
        merge(c,0,c.length-1);
        print(c);

    }
}
