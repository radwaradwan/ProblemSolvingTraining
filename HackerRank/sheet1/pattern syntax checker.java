import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        int n=Integer.parseInt(input.nextLine());
        for(int i=0;i<n;i++){
            String regex = input.nextLine();
            try{
                // check if the pattern is correct then continue 
                // if isn't correct then execute catch
                Pattern.compile(regex);
                System.out.println("Valid");
            }
            catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
            
        }
		
	}
}



