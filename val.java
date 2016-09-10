import java.io.*;
import java.util.*;
public class fascii
{
  public static void main(String[] args) 
  {
		Scanner sc=new Scanner(System.in);
		for(int i=28;i<=128;i++)
		{
			char cd=(char) i;
			System.out.print(cd+" ");
		}
	sc.close();
	}
}
