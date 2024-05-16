package StringPrograms;

import java.util.Scanner;

public class GetCharFromGivenString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sc.nextLine();
		
		System.out.println("Enter index of character to be print :");
		int index = sc.nextInt();
		sc.close();
		
		
		System.out.println("The character at index "+index +" is: "+str.charAt(index-1));
		
	}

}
