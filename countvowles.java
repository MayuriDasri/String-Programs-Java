package StringPrograms;

public class countvowles {
	public static void main(String args[])
	{
		String str="Good Morning";
		int vcnt=0,ccnt=0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
			{
				vcnt++;
			}
			else
			{
				ccnt++;
			}
		}
	//	String lowerstring = str.toLowerCase();
		System.out.println("No  of consonants  are : "+ccnt);

		System.out.println("No of Vowels are : "+vcnt+" Thank you");
	
		System.out.println("The Consonant count is "+ccnt+" and \n The Vowel count is "+vcnt+".");
	}
	

}
