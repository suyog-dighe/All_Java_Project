import java.util.LinkedList;
import java.util.Scanner;

public class linklist {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){
        //create a newnode
//        size++;
        Node newnode= new Node(data);

        if (head==null){
            head=tail=newnode;
            return;
        }

        // newnode of next assign to head

        if(newnode.data > head.data){

            if (newnode.data > head.data &&  tail.data > newnode.data ) {
                Node temp=head;
                newnode.next=temp.next;
                temp.next=newnode;

            }
            else {
                tail.next = newnode;

                tail = newnode;
            }

        }  else {
            newnode.next=head;

            // head = newnode
            head=newnode;

        }

    }
    /*
        // add the last element in linklist
    public void addlast(int data){
        Node newnode1= new Node(data);
        size++;

        if (head==null){
            head=tail=newnode1;
            return;
        }

        tail.next=newnode1;

       tail=newnode1;

    }
    */


    void print(){
//        if (head==null){
//            System.out.println("linklist is empty");
//            return;
//
//        }
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //add element in the middle
/*
    public void add(int id,int data){
        int i=0;
        size++;
        Node newnode=new Node(data);
        Node temp=head;
        while (i<id-1){
            temp=temp.next;
            i++;

        }
        newnode.next=temp.next;
        temp.next=newnode;

    }*/

    //search the element
/*
    public void search(){
        System.out.println("Enter the number to search in linklist : ");
        Scanner sp =new Scanner(System.in);
        int a = sp.nextInt();
        int i=0;
        Node temp=head;
        if (temp!=null) {
            while (temp != null) {
                if (temp.data == a) {
                    System.out.println("key is found on index : " + i);
                }

                temp = temp.next;
                i++;

            }
        }
        else {

            System.out.println("Not found");
        }

    }*/
    public static void main(String[] args) {
//        LinkedList sp=new LinkedList();

        linklist sp = new linklist();
        sp.print();



        sp.addfirst(4);
        sp.addfirst(3);
        sp.addfirst(8);

//        sp.addlast(8);
//        sp.addlast(6);

        sp.print();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a= sc.nextInt();
        sp.addfirst(a);
//        sp.add(3,11);
        sp.print();
//        System.out.println(sp.size);
//        sp.search();



    }
}
