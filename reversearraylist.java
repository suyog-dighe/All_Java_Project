import java.util.ArrayList;


public class reversearraylist {
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp= list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add element
        System.out.println("adding the element in the list"+list);
        list.add(9);  // tc O(1)
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(2);

        System.out.println(list);
//
//        //reverse the arraylist
//        for (int i=list.size()-1;i>=0;i--){
//            System.out.print(list.get(i)+" ");
//        }
//        System.out.println();
//
//        // find maximum number
//        int  max=Integer.MIN_VALUE;
//        for (int i=0;i< list.size();i++){
////           if (max<list.get(i)){
////              max= list.get(i);
////           }
//             max= Math.max(max,list.get(i));
//        }
//        System.out.println("maximum element is " + max);

        //swap the two element in list
        int idx1 =1 , idx2 =3;
        swap(list,idx1,idx2);
        System.out.println(list);
    }
}
