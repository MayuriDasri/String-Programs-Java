package StringPrograms;

import java.util.Scanner;

public class SplittingIntoNumberOfSubStrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		sc.close();
		
		String[] strArray = str.split(" ");
		
		for(int i =0;i<strArray.length;i++)
		{
			System.out.println(strArray[i]+ " ");
		}
	}

}
