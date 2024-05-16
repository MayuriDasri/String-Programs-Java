package StringPrograms;

public class ReverseOnlyGivenString {

	public static void main(String[] args) {
		
		String givenString = "MayuriDasri";
		String reverseString="Mayuri";
		
		int gslen=givenString.length();
		int revlen=reverseString.length();

		String rev = "";
		for(int i=0;i<revlen;i++)
		{
			char ch=reverseString.charAt(i);
			rev=ch+rev;
		}
		/* System.out.println(rev);
		System.out.println(gslen);
		System.out.println(revlen); */
		
		String substring = givenString.substring(revlen,gslen);
		System.out.println(substring);
		String newString = rev+substring;
		System.out.println(newString);
	}

}
