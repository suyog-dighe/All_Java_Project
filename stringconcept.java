import javax.management.relation.InvalidRelationTypeException;
import java.util.Scanner;

public class stringconcept {
    /*
    public  static String touppercase(String str)
    {
        StringBuilder sb= new StringBuilder();
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i) == ' ' && i<str.length()-1)
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else
             {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();

    }



    //compress the string
    public static String compress(String str){
        String newStr =" ";
        for(int i=0;i<str.length();i++ ){
            Integer count=1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;

            }
            newStr +=str.charAt(i);
            if(count>1){
                newStr += count.toString();
            }
        }
        return  newStr;
    }

     */

    //compress the string using StringBuilder
    public  static String compress1(String str)
    {
        StringBuilder sb= new StringBuilder();
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        String newstr=" ";

        for(int i=1;i<str.length();i++)
        {
            Integer count=1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newstr +=str.charAt(i);
            if(count>1){
                newstr += count.toString();
            }
        }

        return  newstr;

    }
    public static void main(String[] args) {
        System.out.println("enter the string which you want to enter : ");
        Scanner sc= new Scanner(System.in);
       String str= sc.nextLine();
        System.out.println(compress1(str));
        //String str =" am i only one person to do this";
        //System.out.println(touppercase(str));

    }
}
