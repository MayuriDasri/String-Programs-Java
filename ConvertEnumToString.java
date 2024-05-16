//Java String Program to Convert Enum to String

package StringPrograms;

import java.util.Scanner;

public class ConvertEnumToString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Enum value : ");
		sc.close();
		
		enum color { Yellow, Blue, Green};
		
		for(color c : color.values() )
		{
			System.out.println(c);
		}
		
	}



}
