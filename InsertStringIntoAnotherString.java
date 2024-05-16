//Java String Program to Insert a string into another string
package StringPrograms;
import java.util.Scanner;

public class InsertStringIntoAnotherString {

	public static void main(String[] args) {
		String s = acceptString();
		String sub = acceptSubString();
		int index = indexPosition();
		insert(s,sub,index);
	}

	private static int indexPosition() {
		System.out.println("Enter the index where sub string to be inserted :");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		return(i);
	}

	private static String acceptSubString() {
		System.out.println("Enter the SubString :");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String sub = sc.nextLine();
		return(sub);
	}
	
	private static String acceptString() {
		System.out.println("Enter the String :");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		return(s);
	}

	private static void insert(String s,String sub,int index) {
		System.out.println("Main String : "+s);
		System.out.println("Sub String :"+sub);
		System.out.println("location where we have to insert sub string :"+index);
		System.out.println("");
		System.out.println("");
		
		String newString = new String();
		for(int i = 0;i<=index;i++)
		{
			//add main string to new string till the index position
			newString = newString+s.charAt(i);
		}
		//add sub string to new string after index position
		newString = newString+sub;
		String sub1 = s.substring(index);
		//add remaining subString to new String
		newString =newString+sub1;
		System.out.println("The new String after inserting sub String : "+newString);
		
	}

}
