//Author:Anuja Yedke
package com.question3;

//program for userdefined exception to check whether the given name exists or not in an array. 
//If name not exists then throw custom exception

import java.util.Scanner;
import javax.naming.InvalidNameException;

public  class CheckName extends Exception
{
		void validateName(String name) throws InvalidNameException
		{
			String[] names= {"Anuja","Rutuja","Vina","Ankita"};			//passing array name
			boolean found=false;		
			for(String n: names)
			{
				if(n.equalsIgnoreCase(name))					//ignores whether the letter is lowercase or uppercase	
				{
					found=true;
					break;
				}
			}
			if(found)
			{
				System.out.println("The name is valid");			//if name found same 
			}
			else
			{
				throw new InvalidNameException("Invalid name,please try again");		//if name not found 
			}
		}
	public static void main(String[] args)
	{
		CheckName ck=new CheckName();			//creating the objetc
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the name:");
				String name=sc.next();				//taking user input
				try
				{
					ck.validateName(name);				//throwing exception
					}
				catch(InvalidNameException e)				//catch the exception
				{
					System.out.println("Invalid name");
				}
				}
}
