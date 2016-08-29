import java.util.Scanner;
public class Join 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
       int a[]=new int[n];
       for(i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
       }
       for(i=0;i<n;i++)
       {
           for(j=i+1;j<n;j++)
           {
               if(a[i]==a[j])
               {
                   a[i]=0;
                   a[j]=0;
                   
               }
           }
           if(a[i]!=0)
           {
               System.out.print(a[i]);
           }
       }
    }
}
