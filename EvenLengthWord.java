//Java String Program to Print even length words

package StringPrograms;

import java.util.Scanner;

public class EvenLengthWord {

	public static void main(String[] args) {
		
		String s = acceptString();
		System.out.println("The Enter String is :"+ s);
		token(s);
	}
	
	@SuppressWarnings("resource")
	public static String acceptString()
	{
		System.out.println("Enter the String :");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		return s;
	}

	public static void token(String s)
	{
		for(String word : s.split(" "))
		{
			int length = word.length();
			if(length %2 == 0)
			{
				System.out.println(word+":"+length);
			}
			//To print odd length string.
//			else
//			{
//				System.out.println(word+":"+length);
//			}
		}
	}
}
