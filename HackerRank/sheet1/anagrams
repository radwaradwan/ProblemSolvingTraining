import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // check if 2 strings have the same characters or not
        if(a.length()!=b.length())
            return false;
        else
        {
            a=a.toLowerCase();
            b=b.toLowerCase();
            char [] arr =a.toCharArray();
            char [] arr2 =b.toCharArray();
            java.util.Arrays.sort(arr);
            java.util.Arrays.sort(arr2);
            for(int i=0;i< arr.length;i++){
                if(arr[i] != arr2[i]) return false;
            }  
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
