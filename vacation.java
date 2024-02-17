package newchapter;
import java.util.Scanner;


          // INTERFACE EXAMPLE
                    /*
                    interface mycamera
                    {
                        void takesnap();
                        void recordvideo();

                    }
                    interface mywifi{

                        String[] getnetworks();
                        void  connecttonetworks(String network);
                    }
                    class mycellphone{

                        void callnumber(int phonenumber){
                            System.out.println("calling "+phonenumber);
                        }
                        void pickup()
                        {
                            System.out.println("connecting.....");
                        }
                    }
                    class mysmartphone extends mycellphone implements mycamera,mywifi{

                        public void takesnap()
                        {
                            System.out.println("taking snap...");

                        }
                        public void recordvideo()
                        {
                            System.out.println("recording 4k video ...... starting");
                        }


                        public String[] getnetworks() {
                            System.out.println("getting list of the network");
                            String[] networklist ={"suyog","swaraj","atharva"};
                            return networklist;
                        }
                        public void connecttonetworks(String network){
                            System.out.println("connecting  to "+network);
                        }
                     }

                     */



          // DYNAMIC METHOD DISPATCH
                      /* class smartphone {

                        public void greet() {
                            System.out.println("hello good morning ");
                        }

                        public void name() {
                            System.out.println("I am the hacker");
                        }

                    }
                    class phone extends smartphone {
                        public void hello() {
                            System.out.println("so my name is suyog");

                        }

                        public void name() {

                            System.out.println("I am the only one person who invented color");
                        }

                    }

                       */
    //  public class vacation {
          // RING,VIBRATE ,CALLING FRIEND LOGIC WRITTEN
                        /*
                        public void ring(){
                            System.out.println("ringing.......");
                        }
                        public  void  vibrate(){
                            System.out.println("vibrating......");
                        }
                        public void callfriend()
                        {
                            System.out.println("calling friend....");
                        }

                         */


           //3 DOT METHOD PROGRAM
                        /*static int sum1(int ... arr)
                        {
                            int result =0;
                            for (int a:arr){
                                result +=a;
                            }
                            return result;

                        }*/

            // factorial using method

                       /* static int factorial(int n)
                        {
                            if(n==0 || n==1)
                            {
                                return 1;
                            }
                            else {
                                return n*factorial(n-1);
                            }

                        }

                        */
   public class vacation {
    public static void main(String[] args) {

        // PASSED OR FAILED OF STUDENT PROGRAM
                        /*float marks;
                        float n1,n2,n3;

                        Scanner sc= new Scanner(System.in);


                        n1 = sc.nextFloat();

                        System.out.println("enter 2nd subject marks :");
                        n2= sc.nextFloat();

                        System.out.println("enter 3rd subject marks :");
                        n3= sc.nextFloat();
                        System.out.printf("your 1st subject marks is %f ......  2nd subject marks is %f ....... 3rd subject marks is %f\n",n1,n2,n3);
                        float avg =(n1+n2+n3)/3.0f;
                        if(avg>=40 && n1>=33 && n2>=33 && n3>=33)
                        {
                            System.out.println("your are passed in exam ");
                        }
                        else
                        {
                            System.out.println("your are failed");
                        }*/

        // PATTERN PROGRAM
                       /* int n=4;
                        for (int i=n;i>0;i--)
                        {
                            for (int j=0;j<i;j++)
                            {
                                System.out.print(" * ");
                            }
                            System.out.println("\n");
                        }*/

        // SUM OF THE N NUMBER USING WHILE LOOP
                        /*int sum=0;
                        int n;
                        int i=1;
                        Scanner sc=new Scanner(System.in);
                        System.out.println("enter the number");
                        n=sc.nextInt();
                        while (n>=i)
                        {
                            sum=sum+i;
                            i++;

                        }
                        System.out.print("sum of even number is ");
                        System.out.println(sum);
                        */
        //MULTIPLICATION TABLE

                        /*int n;
                        Scanner sc= new Scanner(System.in);
                        System.out.println("enter the number to display the table");
                        n= sc.nextInt();
                        System.out.println("given input table is below :");
                        for (int i=1;i<=10;i++)
                        {
                            System.out.println(i*n);
                        }
                         */
        //3 DOT METHOD PROGRAM

                       /* System.out.println(sum1( 4,5,6));
                        System.out.println("the sum is "+sum1(4,5,44));

                        */
        // factorial using method
                       /* int n;
                        Scanner sc=new Scanner(System.in);
                        System.out.println("enter the number");
                        n=sc.nextInt();
                        System.out.println("the factorial is "+factorial(n));

                        */
        // RING,VIBRATE ,CALLING FRIEND LOGIC WRITTEN


                        /*vacation realme =new vacation();
                        realme.callfriend();
                        realme.vibrate();
                        realme.ring();

                         */
        // DYNAMIC METHOD DISPATCH
                        /*
                        smartphone obj=new phone();
                        smartphone obj1 =new smartphone();
                        phone obj2 = new smartphone(); // not allowed
                        obj.greet();
                        obj.name();
                        obj1.name();

                         */
        // INTERFACE EXAMPLE
                        /*
                        mysmartphone sd= new mysmartphone();
                        mycellphone sp =new mycellphone();
                        sp.callnumber(4578);
                        sp.pickup();

                        sd.connecttonetworks("ganesh");
                        sd.recordvideo();
                        sd.takesnap();
                        sd.pickup();
                        sd.callnumber(45865555);
                        String[] ar= sd.getnetworks();
                        for ( String item:ar)
                        {
                            System.out.println(item);
                        }

                         */



    }
}




