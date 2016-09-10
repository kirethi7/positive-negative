import java.util.Scanner;

public class PalindromeTwoVowel {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		String str=new String();
		str=input.next();
		StringBuffer sb=new StringBuffer(str);
		if(sb.equals(sb.reverse()))
		{
			if(str.contains("a"))
			{
				if(str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u"))
					System.out.println("true");
				else
					System.out.println("false");
			}
			else if(str.contains("e"))
			{
				if(str.contains("a") || str.contains("i") || str.contains("o") || str.contains("u"))
					System.out.println("true");
				else
					System.out.println("false");
			}
			else if(str.contains("i"))
			{
				if(str.contains("e") || str.contains("a") || str.contains("o") || str.contains("u"))
					System.out.println("true");
				else
					System.out.println("false");
			}
			else if(str.contains("o"))
			{
				if(str.contains("e") || str.contains("i") || str.contains("a") || str.contains("u"))
					System.out.println("true");
				else
					System.out.println("false");
			}
			else if(str.contains("u"))
			{
				if(str.contains("e") || str.contains("i") || str.contains("o") || str.contains("a"))
					System.out.println("true");
				else
					System.out.println("false");
			}
			else
				System.out.println("false");
			
		}
		input.close();
	}
}
