//
//An anagram of a string is another string that contains the same characters, only the order of characters can be different.
//For example, “abcd” and “dabc” are an anagram of each other

package StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String 1 : ");
		String s1 = sc.next();
		
		System.out.println("Enter the String 2 : ");
		String s2 = sc.next();
		
		sc.close();
		
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		
		//Sorting character arrays
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		int flag = 0;
		
		for(int i = 0;i<c1.length;i++)
		{
			if(c1[i]==c2[i])
				flag = 1;
			else
				flag = 0;
			
		}
		if(flag ==1)
			System.out.println("Strings are Anagram");
		else
			System.out.println("String are not Anagram");
		
	}

}
