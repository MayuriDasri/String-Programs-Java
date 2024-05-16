//Java String program to check whether a string is a Palindrome

package StringPrograms;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		String rev = "";
		sc.close();
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev+s.charAt(i);
		}
		System.out.println("Reverse String is :"+rev);
		
		if(s.equalsIgnoreCase(rev) )
			System.out.println(s+" is Palindrome");
		else
			System.out.println(s+" is not Palindrome");
	}

}
