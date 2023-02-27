import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
                Scanner input=new Scanner(System.in);
        int lines= input.nextInt();
        // making list of arraylist to store each line in list and store each arraylist in a line
        List<ArrayList<Integer>> listoflists=new ArrayList<ArrayList<Integer>>(lines);
        for(int i=0;i<lines;i++){
            int n=input.nextInt();
            ArrayList<Integer> innerlist=new ArrayList<Integer>(n);
            for(int j=0;j<n;j++){
                innerlist.add(input.nextInt());
            }
            listoflists.add(innerlist);
        }

        int queries=input.nextInt();
        for(int i=0;i<queries;i++){
            int x=input.nextInt();
            int y=input.nextInt();
            try{
                // makeing x-1 , y-1 as listof lists 0 based
                System.out.println(listoflists.get(x-1).get(y-1));
            }
            catch (IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
    }
}
