import java.util.*;
public class JavaSubstringComparision
{
    public static String getSmallestAndLargest(String S,int k)
    {
        
         String smallest=S.substring(0,k);
         String largest=smallest;
         for(int i=1; i<=S.length()-k; i++)
         {
            String sub=S.substring(i,i+k);
            if(sub.compareTo(smallest)<0)
            {
                smallest=sub;
            }
            if(sub.compareTo(largest)>0)
            {
                largest=sub;
            }
         }
         return smallest+ "\n" +largest;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        int k=sc.nextInt();
        System.out.println(getSmallestAndLargest(S, k));
    }
}