package StringPrograms;


public class whitespaceremove 
{
	public static void main(String args[])
	{

	String str= "My Name is        Mayuri";
	String newstr="";
	newstr=str.replaceAll(" ","");
	
	
	/*for (int i=0;i<=str.length()-1;i++)
	{
		char ch=str.charAt(i);
		
		if(!Character.isWhitespace(ch))
		{
			newstr=newstr+ch;
		}
	} */
	
	
	System.out.println("The New String after removing space: "+newstr);
	}
}