import java.util.Scanner;

public class MultiplicationOfTwoNumbers {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String str3=input.nextLine();
		int numb=Integer.parseInt(str)*Integer.parseInt(str3);
		System.out.println(String.valueOf(numb));
		input.close();
	}

}
