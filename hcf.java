import java.util.Scanner;
public class main {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int i;
	int hcf=0;
	for(i=1;i<=a && i<=b;i++)
	{
		if((a%i==0) && (b%i==0))
			hcf=i;
	}
	System.out.println(hcf);
}
}
