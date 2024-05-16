//Insert Sub String at begining of the main String 

package StringPrograms;

import java.util.Scanner;

public class InsertSubStringAtStart {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Main String:");
		String s = sc.nextLine();
		System.out.println("Enter SubString : ");
		String sub = sc.nextLine();
		
		s=sub+" "+s;
		System.out.println("Modified Main String :"+ s);
		
		sc.close();
	}

}
