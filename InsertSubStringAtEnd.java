//Insert SubString at the end
package StringPrograms;

import java.util.Scanner;

public class InsertSubStringAtEnd {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Main String : ");
		String s = sc.nextLine();
		
		System.out.println("Enter Sub String : ");
		String sub = sc.nextLine();
		
		String newString = s + " " + sub;
		System.out.println("New String "+ newString);
		sc.close();
	}

}
