/*WAJP to find biggest of two number by using conditional operator.*/
import java.util.Scanner;
public class BiggestOfTwo{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a =sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		int result=(a>b)?a:b;
		System.out.println(result);
			
	}
}