
//Replace Occurance of Character 

package StringPrograms;

import java.util.Scanner;

public class ReplaceOccuranceofChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		System.out.println("Enter the character which has to be replaced with :");
		char oldChar = sc.next().charAt(0);
		
		System.out.println("Enter the character to be replaced :  ");
		char newchar = sc.next().charAt(0);
		
		System.out.println("Enter index occurance of charcter :");
		int index = sc.nextInt();
		
		sc.close();
		
		int flag = 0;
		for (int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == oldChar  && i == index)
				{
					flag = 1;
					str = str.replace(oldChar , newchar);
					break;
				}
		}
		
		if(flag == 0)
			System.out.println("Character not found for replaced ");	
		else
			System.out.println("The Modified String is : "+ str);
			
		}

	}

