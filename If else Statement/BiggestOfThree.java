/* WAJP TO FIND BIGGEST OF THREE NUMBER BY USING IF ELSE STATEMENT*/

import java.util.Scanner;
class BiggestOfThree{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Value of a");
		int a=sc.nextInt();
		System.out.println("Enter The Value of b");
		int b=sc.nextInt();
		System.out.println("Enter The Value of c");
		int c=sc.nextInt();
		
	   if(a>b && a>c)
		{
			System.out.println("Biggest Of Three is: "+a);
		}
	   else if(b>a && b>c)
		{
			System.out.println("Biggest Of Three is: "+b);
		}
	    else{
			System.out.println("Biggest Of Three is: "+c);
		}	
	}
}