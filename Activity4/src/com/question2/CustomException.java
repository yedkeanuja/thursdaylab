//Author:Anuja yedke

package com.question2;
import java.util.Scanner;
//Code to accept the weight and age values of a person through runtime, and if the user enters age less than 18 and weight less than 50



class InvalidAgeWeightException extends Throwable
{
	InvalidAgeWeightException(String str)
	{
		
	}
}
public class CustomException {
	     static int age;
		 static int weight;
		 static void validation(int age, int weight) throws InvalidAgeWeightException
		{
				try {
					if(age<=18)
					{
						throw new InvalidAgeWeightException("Invalid age");
					}
					else
					{
						System.out.println("Valid age");
					}
				}
				catch (InvalidAgeWeightException e) 
				{
					e.printStackTrace();
				}
				try 
				{
					if(weight<50)
					{
					
						throw new InvalidAgeWeightException("Invalid weight");
					}
					else
					{
						System.out.println("Valid weight");
					}
				} 
				catch (InvalidAgeWeightException e)
				{
					e.printStackTrace();
				}
		}
	public static void main(String[] args) throws InvalidAgeWeightException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		System.out.println("Enter the weight:");
		int weight =sc.nextInt();
		CustomException e=new CustomException();
		e.validation(age, weight);		
	}
}

