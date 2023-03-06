import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
 

        // compareto if the 2 strings are equal , it returns 0
        // compareto if the 1st string is less than the 2nd string, it returns negative number
        // compareto if the 1st string is greater than the 2nd string, it returns positive number
        for(int i=0;i<s.length();i++){
            if(i<=s.length()-k)
            {
                String sub=s.substring(i,i+k);
                if(sub.compareTo(smallest)<0){
                    smallest=sub;
                }
                else if(sub.compareTo(largest)>0){
                    largest=sub;
                }
            }
        }
        
        return smallest + "\n" + largest;
    }

