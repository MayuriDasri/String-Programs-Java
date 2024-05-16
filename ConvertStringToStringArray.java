//Java String Program to Convert String to String Array

package StringPrograms;

import java.util.Scanner;

public class ConvertStringToStringArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :  ");
		String str = sc.nextLine();
		sc.close();
		
		
		String strArray[] = str.split(" ");
		
		System.out.println("String Array is : ");
		System.out.print("[ ");
		for(int i = 0;i <strArray.length;i++)
		{
			System.out.print(strArray[i]+ " ");
		}
		System.out.println(" ]");
		
		
		
		
	}

}
