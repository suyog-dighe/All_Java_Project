import java.util.ArrayList;

public class PairSum {
    public static boolean sum(ArrayList<Integer> list,int target){

        // time complexity = O(n)
        int lp=0;
        int rp=list.size()-1;
        while (lp!=rp){
            if (list.get(lp)+list.get(rp)==target){
           return true;
//
//                System.out.println(list.get(lp)+" "+list.get(rp));
//                break;
            }
            if (list.get(lp)+list.get(rp)<target) {
                lp++;

            }
            if (list.get(lp)+list.get(rp)>target) {
                rp--;

            }
        }
       return false;


       // return list.get(lp)+list.get(rp);
/*
        // time complexity = O(n^2)
        for (int i=0;i<list.size();i++){
            for (int j=i+1;j< list.size();j++){
                if (list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;*/
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(8);
        list.add(3);

        int target =17;
        System.out.println( sum(list,target));


    }
}
