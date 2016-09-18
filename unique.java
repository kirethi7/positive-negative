import java.util.*;
public class arrays
{
  public static void main(String args[])
  {
    String str;
    Scanner scan=new Scanner(System.in);
    str=scan.nextLine();
    int len=str.length();
    char a[]=str.toCharArray();
    int k=0;
    int a1[]=new int[a.length];
    for(int j=0;j<a.length;j++)
    {
      int a1[k]=Character.getnumericValue(a[j]);
      k++;
      }
    
    for(int i=0;i<a1.length;i++)
    {
      int count=0;
      int j1=a[i];
      for(int j=0;j<a1.length;j++)
      {
        if(j1==a1[j])
        {
          count++;
        }
      }
      if(count==1)
      {
        System.out.print(j1);
      }
    }
  }
}
