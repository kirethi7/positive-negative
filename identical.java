import java.io.*;
import java.util.*;
class star{
public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	String ss=sc.nextLine();
	for(int i=0;i<ss.length()-1;i++)
	{
	System.out.print(ss.charAt(i));
	if(ss.charAt(i)==ss.charAt(i+1))
	{
	System.out.print("*");
	}
	}
	System.out.print(ss.charAt(ss.length()-1));
	}
}
