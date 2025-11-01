import java.util.*;
public class StringExtractor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        int start=sc.nextInt();
        int end=sc.nextInt();
        if(start>-1 && end<= string.length() && end>=start) // checks whether the entered value is in range
        {
        String fstring=string.substring(start,end); // extracts string from the original 
        System.out.println(fstring);
        }
    }
}