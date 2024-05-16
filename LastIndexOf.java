package StringPrograms;

import java.util.Scanner;

public class LastIndexOf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter search term here");
		String searchText = sc.nextLine();
		sc.close();
		
		String str = " I Love Java Programming and Java is an easy language";
		
		System.out.println(str.lastIndexOf(searchText));
		if(str.lastIndexOf(searchText)!=-1)
			System.out.println("Search Text Found");
		else
			System.out.println("Search Term not Found");
	}

}
