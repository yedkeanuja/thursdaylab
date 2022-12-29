//author:anuja yedke
package com.question3;

	import java.util.Collections;
	import java.util.Iterator;
	import java.util.TreeSet;

	public class Colors {

		public static void main(String[] args) {
			TreeSet<String> co=new TreeSet<>();
			co.add("Pink");				
			co.add("Broun");		
			co.add("Green");
			co.add("Blue");
			for(String s:co)
			{
				System.out.println(s);
				
			}
			System.out.println("-----------------------------");
			
			TreeSet<String> co1=new TreeSet<>();
			co1.addAll(co);	
			 //reversing the elements in the tree set
			Iterator<String> itr=co1.descendingIterator();    
			while(itr.hasNext())
			{
				System.out.println(itr.next());	
			}
			System.out.println("-----------------------------");
			System.out.println(co1.equals(co));		
			
			System.out.println("-------------------------------------");
			//getting first element from the tree set
			System.out.println("to get first element "+co1.pollFirst());
			//getting last element from the tree set
			System.out.println("To get Last element "+co1.pollLast());		

		}

	}


