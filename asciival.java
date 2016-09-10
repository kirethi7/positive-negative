import java.io.*;
import java.util.*;
public class Ascii
{
  public static void main(String[] args) 
  {
		Scanner sc=new Scanner(System.in);
		for(int i=28;i<=128;i++)
		{
			char a=(char) i;
			System.out.print(a+" ");
		}
	sc.close();
	}
}
