import java.util.*;
public class substr
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String[]arr=str.split("");
    int len=arr.length;	
		TreeSet<String> al=new TreeSet<String>(); 
		for(int i=0;i<len;i++)
		  al.add(arr[i]);   
		Iterator<String> itr=al.iterator();  
		  while(itr.hasNext())
		    System.out.print(itr.next());  
		}
}
