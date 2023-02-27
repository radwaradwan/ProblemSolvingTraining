import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat nf_us = NumberFormat.getCurrencyInstance(Locale.US);
        String us= nf_us.format(payment);
        NumberFormat nf_india=NumberFormat.getCurrencyInstance(new Locale("en","in"));
        String india=nf_india.format(payment);
        NumberFormat nf_china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china=nf_china.format(payment);
        NumberFormat nf_france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france=nf_france.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
