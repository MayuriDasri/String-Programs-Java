//Java String Program to Iterate Over Characters in String

package StringPrograms;

import java.util.Scanner;

public class IterateoverChractersofString {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to be converted in character Array :");
		String str = sc.nextLine();
		sc.close();
		
		System.out.println("Charcter Array is :");
		for(int i = 0;i<str.length();i++)
		{
			System.out.print(str.charAt(i)+ " ");
		}
		
		
		
//		//2nd Method 
//		char[] strArray = str.toCharArray();
//		
//		int size = strArray.length;
//		
//		System.out.println("Charcter Array is :");
//		
//		for(int i=0;i<size;i++)
//		{
//			System.out.print(strArray[i]+ " ");
//		}
		
		
		
		
	}

}
