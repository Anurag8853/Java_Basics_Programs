/*WAJP to find biggest of three numbers by using conditional operator.*/
import java.util.Scanner;
public class BiggestOfThree{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the first value");
			int a=sc.nextInt();
			System.out.println("Enter the second value");
			int b=sc.nextInt();
			System.out.println("Enter the third value");
			int c=sc.nextInt();
			
			int result=(a>b)?((a>c)?a:c):((b>c)?b:c);
			System.out.println(result);
		}
}