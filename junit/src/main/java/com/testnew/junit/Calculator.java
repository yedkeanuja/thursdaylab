package com.testnew.junit;



public class Calculator {

	public static double addition(double d, double e)
	{
		return d+e;
	}
	public static int substraction(int a,int b)
	{
		return a-b;
	}
	 
	public Integer multiplication(int i, int j) {
		
		return i*j;
	}
	public Integer factorial(int n) {
		 int i,fact=1;  
		 
		 
		  for(i=1;i<=n;i++){    
		      fact=fact*i; }   
		return fact;
	}
	public Integer division(int a, int b) {
		
		return a/b;
	}
	
	
	public int findMax(int arr[]) 
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++) 
		{
			if(max<arr[i]) {
				{
					max=arr[i];
				}
			}	
			
				return max;
			}
		return max;
	}
	
}





