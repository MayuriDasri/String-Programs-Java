//•	Java String Program to  Add Characters to a String

package StringPrograms;

import java.util.Scanner;

public class AddCharactersToString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		
		System.out.println("Enter character : ");
		char ch = sc.next().charAt(0);
		
		System.out.println("Enter the position");
		int index = sc.nextInt();
		sc.close();
		
		String newString = "";
		
		for(int i=0;i<index;i++)
		{
			newString = newString+s.charAt(i);
		}
		newString = newString+ch;
		String subString = s.substring(index);
		
		newString = newString+subString;
		System.out.println("The New String is : "+newString);
		
		
	}

}
