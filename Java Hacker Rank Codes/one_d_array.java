// https://www.hackerrank.com/challenges/java-1d-array-introduction/problem?isFullScreen=true

import java.util.*;
public class one_d_array
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j:arr)
        {
            System.out.println(j);
        }
    }
}

//alternate method

/*
 

import java.util.*;
public class Solutions
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]= new int[n]; //hey
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0; j<arr.length; j++)
        {
            System.out.println(arr[j]);
        }
    }
}

*/