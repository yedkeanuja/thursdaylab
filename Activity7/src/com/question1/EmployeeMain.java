
package com.question1;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1=new Employee(1,"Gauri",11,25000);
		Employee e2=new Employee(3,"Anuja",12,60000);
		Employee e3=new Employee(5,"Ankita",13,35000);
		Employee e4=new Employee(4,"Darshana",14,15000);
		
		ArrayList<Employee> el=new ArrayList<>();
		el.add(e1);				
		el.add(e2);
		el.add(e3);
		el.add(e4);
		
		Collections.sort(el);		//sorting the element in ascending order
		for(Employee o:el)
		{
			System.out.println(o.id+" "+o.name+" "+o.age+" "+o.salary);
		}

	}

}
    
    
 