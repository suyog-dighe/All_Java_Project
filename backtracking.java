public class backtracking {

    public static void changeArr(int arr[],int i,int val){
        //base case
        if(i==arr.length){
            System.out.println("base case");
            printArr(arr);

            return;

        }
        //recursion
        arr[i]=val;
        changeArr(arr,i+1,val+1); // fucntion call  step
        arr[i]=arr[i]-2;  //backtracking step
    }

    public static void printArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=new int[6];
        changeArr(arr,0,1);
        System.out.println("backtracking");
        printArr(arr);


    }
}
