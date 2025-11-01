//https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true


/*

 NOTE:
 • NumberFormat (java.text.NumberFormat) is used to format numbers as:
   - Plain numbers
   - Currency
   - Percentages
   It can also parse strings back into numbers.

 • getCurrencyInstance() → returns a NumberFormat object that formats
   numbers as currency (adds symbol, grouping, decimals) based on Locale.

 • Locale → represents a region/language setting (e.g., Locale.US, Locale.CHINA, new Locale("en", "IN")).
   It controls how numbers, dates, and currency symbols are displayed.

*/


/* the code below is written in java 7 which gives the output Rs. payment
and not ₹ payment as mentioned in the question...*/

import java.text.NumberFormat; 
import java.util.*;

public class CurrencyFormatter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double payment=sc.nextDouble();
        sc.close();
        
        //create Numberformat insitances for each locale
        NumberFormat usformat= NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaformat= NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chinaformat=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceformat=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        //format the payment
        String us= usformat.format(payment);
        String ind= indiaformat.format(payment);
        String china= chinaformat.format(payment);
        String france= franceformat.format(payment);
        
        //printing the results
        System.out.println("US: "+ us);
        System.out.println("India: "+ind);
        System.out.println("China: "+china);
        System.out.println("France: "+france);
        
    }
}

/*
 • India currency formatting issue:
   - Older Java versions (Java 6 / early Java 8) → showed "Rs." (e.g., Rs.12,34,567.89)
   - Newer Java versions (Java 8 update 91+, Java 11, Java 15+) → show "₹" (e.g., ₹12,34,567.89)
   - Reason → newer JDKs include updated locale data with the official rupee symbol.
   - Both outputs ("Rs." and "₹") are correct depending on Java version.
 */
