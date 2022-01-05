// { Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}
// } Driver Code Ends


class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();
        int value=0;
        for(int i=0;i<str1.length();i++){
            hm1.put(str1.charAt(i),hm1.getOrDefault(str1.charAt(i),0)+1);
        }
        for(int i=0;i<str2.length();i++){
            hm2.put(str2.charAt(i),hm2.getOrDefault(str2.charAt(i),0)+1);
        }
        if(hm1.size()!=hm2.size()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            value = hm1.get(str1.charAt(i));
            if(value==hm2.get(str2.charAt(i))){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
        
        
        // Your code here
        
    }
}