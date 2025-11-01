// https://www.hackerrank.com/challenges/java-datatypes/problem?isFullScreen=true

import java.math.BigInteger;
import java.util.*;
public class datatype
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0; i<T; i++)
        {
            BigInteger n=sc.nextBigInteger();
            if(n.compareTo(BigInteger.valueOf(Byte.MIN_VALUE))>0 && n.compareTo(BigInteger.valueOf(Byte.MAX_VALUE))<0)
            System.out.println(n+" can be fitted in:\n* byte\n* short\n* int\n* long");
            else if(n.compareTo(BigInteger.valueOf(Short.MIN_VALUE))>0 && n.compareTo(BigInteger.valueOf(Short.MAX_VALUE))<0)
            System.out.println(n+" can be fitted in:\n* short\n* int\n* long");
            else if(n.compareTo(BigInteger.valueOf(Integer.MIN_VALUE))>0 && n.compareTo(BigInteger.valueOf(Integer.MAX_VALUE))<0)
            System.out.println(n+" can be fitted in:\n* int\n* long");
            else if(n.compareTo(BigInteger.valueOf(Long.MIN_VALUE))>0 && n.compareTo(BigInteger.valueOf(Long.MAX_VALUE))<0)
            System.out.println(n+" can be fitted in:\n* long");
            else
            System.out.println(n+" can't be fitted anywhere.");
            
        }
    }
}
