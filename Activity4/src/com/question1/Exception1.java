//Author:Anuja yedke

package com.question1;
	import java.util.Scanner;

	class Exception1 {
	 
		public static void main(String arg[])
	    {  
			try
			{
				// declare and initialize here.
				int a,b,c;
				Scanner KB=new Scanner(System.in);
				
				// input numbers here.
				System.out.print("Enter first number : ");
				a=KB.nextInt();
	       
				System.out.print("Enter second number : ");
				b=KB.nextInt();
	       
				//throw to catch
				c=a/b;
				System.out.println("Result:"+c);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Error:"+e.getMessage());
				System.out.println("Error:"+e);
			}
			// here program ends.
			System.out.println("End of Program...");
		}
	}
