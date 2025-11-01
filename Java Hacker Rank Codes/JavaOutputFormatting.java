//https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true



import java.util.*;
public class JavaOutputFormatting
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0; i<3; i++)
        {
        String string=sc.next();

        int number=sc.nextInt();
        System.out.printf("%-15s%03d%n", string, number);
        }
        System.out.println("================================");
    }
}
