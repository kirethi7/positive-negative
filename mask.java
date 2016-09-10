import java.util.Scanner;

public class mask{
public static void main(String[] args) {
		String s;
		String s1;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		s1=sc.next();
		StringBuffer a=new StringBuffer(s);
		StringBuffer b=new StringBuffer(s1);
		for(int i=0;i<a.length();i++)
		{
			for(int j=0;j<b.length();j++)
			{
				if(a.charAt(i)==b.charAt(j))
				{
					a.deleteCharAt(i);
				}
				
			}
			System.out.println(a);
}
	}

}
