import java.util.Scanner;

public class subsetarray {

	public static void main(String[] args) {
		String str;
		String str1;
		Scanner scan=new Scanner(System.in);
		str=scan.nextLine();
		str1=scan.nextLine();
		char a[]=str.toCharArray();
		int num[]=new int[a.length];
		char a1[]=str1.toCharArray();
		int num1[]=new int[a1.length];
		for(int i=0;i<a.length;i++)
		{
			num[i]=Character.getNumericValue(a[i]);
		}
		for(int i=0;i<a1.length;i++)
		{
			num1[i]=Character.getNumericValue(a1[i]);
		}
		int count=0;
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num1.length;j++)
			{
				if(num[i]==num1[j])
				{
					count++;
				}
			}
		}
		if(count==num.length)
		{
			System.out.println("subset array");
		}
		else
		{
			System.out.println("not subset array");
		}
	}

}
