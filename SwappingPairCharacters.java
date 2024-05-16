//Java String Program to Swapping Pair of Characters

package StringPrograms;

import java.util.Scanner;

public class SwappingPairCharacters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		System.out.println("Enter the 1st character to swap : ");
		char ch1 = sc.next().charAt(0);
		
		System.out.println("Enter the 2nd character to be swap with :");
		char ch2 = sc.next().charAt(0);
		
		sc.close();
		System.out.println("The Original String is :"+ str);
		
		for(int i =0; i<str.length();i++)
		{
			if(str.charAt(i) == ch1 )
				str = str.replace(ch1, ch2);
		}
		
		System.out.println("The modified string is : "+str);

	}

}
