import java.util.Scanner;
public class vowel {
       public static void main(String[] args) {
           Scanner sc= new Scanner(System.in);
           String s1=sc.nextLine();
           String s2="";
           int i;
           for(i=s1.length()-1;i>=0;i--)
           {
                System.out.print(s1.charAt(i));   
           }
           System.out.println();
           for(i=s1.length()-1;i>=0;i--)
           {
               if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i'|| s1.charAt(i)=='o'||s1.charAt(i)=='u' ||s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i) == 'U')
                    continue;
               else
                   System.out.print(s1.charAt(i));
                   }
           
              
    }
}
