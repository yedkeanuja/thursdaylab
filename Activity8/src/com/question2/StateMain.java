
package com.question2;

import java.util.Iterator;

public class StateMain {

	public static void main(String[] args) {
		State a=new State();
		a.addState("Maharshatra");			
		a.addState("Rajasthan");
		a.addState("Karnataka");
		a.addState("Kerala");
		
		System.out.println("Retrive the details of state:"+a.retriveState("Maharashtra"));		 

	}

}