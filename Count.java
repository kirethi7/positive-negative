import java.io.*;
import java.util.*;
class Count 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
      int num = sc.nextInt();
      int temp,count=0;
while(num!=0)
{
    temp=num%10;
    count=count+1;
    num=num/10;
}
System.out.println(count);
      
}
