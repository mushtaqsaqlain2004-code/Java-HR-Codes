// https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true

import java.util.*;
public class Stringtoken
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.trim();
        if(str.isEmpty())
        {
            System.out.println(0);
            return;
        }
        String[] words=str.split("[^A-Za-z]+");
        if(words.length==1 && words[0].isEmpty())
        {
            System.out.println(0);
            return;
        }
        System.out.println(words.length);
        for(String w:words)
        {
            System.out.println(w);
        }
        sc.close();
    }
}