import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        // add element
        System.out.println("adding the element in the list"+list);
        list.add(2);  // tc O(1)
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(2);

        //second way to add the element

        list.add(1,9);//time complexity is O(n)

        System.out.println(list);

        // get element
      int ele=  list.get(2);
        System.out.println("getting the element from the list");
        System.out.println(ele);
        System.out.println(list.get(3));


    // remove the element
        list.remove(2);
        System.out.println("removing the element from the list");
        System.out.println(list);

        //set the element

        list.set(2,9);
        System.out.println("set the new element ");
        System.out.println(list);

        //contain the element or not



        System.out.println("contain element or not");
        System.out.println(list.contains(2));
        System.out.println(list.contains(9));
        System.out.println(list.contains(5));


        //size of arraylist
        System.out.println("size of the array");
        System.out.println(list.size());

        //print the arraylist
        System.out.println("display the element ");
        for (int i=0;i< list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
