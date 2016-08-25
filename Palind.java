import java.util.*;
public class Palind
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
      int num = sc.nextInt();
      int temp,count=0;
      int sum;
      sum=num;
while(num!=0)
{
    temp=num%10;
    count=count*10+temp;
    num=num/10;
}
if(count==sum)
System.out.println("palindrome");
else
System.out.println("not palindrome");
   }   
}
    
