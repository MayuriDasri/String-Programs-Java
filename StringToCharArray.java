package StringPrograms;

public class StringToCharArray {

	public static void main(String[] args) {
		
		String name = new String("Mayuri");
		System.out.println(name);
		
		int len = name.length();
		char[] nameArray = new char[len];
		
		for(int i =0 ;i<len;i++)
		{
			nameArray[i] = name.charAt(i);
		}
		System.out.println("Length of Char Array is : "+nameArray.length);
		
		for(int i=0;i<nameArray.length;i++)
		{
			System.out.print(nameArray[i]+" , ");
		}
	}

}
