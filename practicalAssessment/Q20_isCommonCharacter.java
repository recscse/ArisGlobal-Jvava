package practicalAssessment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q20_isCommonCharacter {
	static boolean check(String s1, String s2)
	{
	    Map<Character, Integer> mp = new HashMap<>();
	    for (int i = 0; i < s1.length(); i++)
	    {
	        mp.put(s1.charAt(i), mp.get(s1.charAt(i)) == null ? 1 : mp.get(s1.charAt(i)) + 1);
	    }
	    for (int i = 0; i < s2.length(); i++)
	    {
	        if (mp.get(s2.charAt(i)) > 0)
	        {
	            return true;
	        }
	    }
	    return false;
	}
	
	public static void main(String[] args)
	{
	 
	   Scanner sc = new Scanner(System.in);
	   String s1 = sc.next();
	   String s2 = sc.next();
	    boolean yes_or_no = check(s1, s2);
	    
	    if (yes_or_no == true)
	    {
	        System.out.println("Yes");
	    }
	    else
	    {
	        System.out.println("No");
	    }
	}


}
