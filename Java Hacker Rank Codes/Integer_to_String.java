import java.util.*;
public class Integer_to_String
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>-101 && n<101)
        {
            String convert=Integer.toString(n);
            int check=Integer.parseInt(convert);
            System.out.println("Good job");
        }
        else 
        {
            System.out.println("Wrong answer");
        }
    }
}