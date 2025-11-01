import java.util.*;
public class Stringsum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String first=sc.nextLine();
        String second=sc.nextLine();
        int length1=first.length();
        int length2=second.length();
        int sum= length1 + length2;
        System.out.println(sum);
        int compare=first.compareTo(second);
        if(compare>0)
        { 
        System.out.println("Yes");
        }
        else
        {
        System.out.println("No");
        }
        String final1=first.substring(0,1).toUpperCase()+first.substring(1);
        String final2=second.substring(0,1).toUpperCase()+second.substring(1);
        System.out.println(final1+ " "+ final2);
    }
}
