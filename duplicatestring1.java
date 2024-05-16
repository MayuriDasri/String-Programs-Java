package StringPrograms;

public class duplicatestring1 {

	public static void main(String[] args) {
		
		String name = "Maayuuri";
		
		char str[] = name.toCharArray(); 
	
		//char s1;
		int count,i,j;
		
		System.out.println("Original String is : "+ name);
		System.out.println("Duplicater character count is As Follows : ");
		System.out.println();
		
		//Maayuuri
		//01234567
		
		for (i=0;i<=name.length()-1;i++)   //I=0 1 2
		{
			count =1;
			for(j = i+1; j <name.length(); j++)  //J=1 2 3 j=2 j=3 j=3
            {  
				if(str[i] == str[j] && str[i]!=' ')   //m==a m==a m==y a==a a==y a==y
				{
					count++;
					// str[j] = '0';   //a==0
				}
			}
			if(count >=1 && str[i] != '0')
			
			System.out.println(str[i]+" character occurs "+ count+ " times");
		} 
		
		
	}
}
		
		