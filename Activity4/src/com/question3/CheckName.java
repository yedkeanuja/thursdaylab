
//Author:Anuja yedke
package com.question3;
import java.util.Scanner;

public class CheckName {
	
    void validateName(String name) throws InvalidNameException {
 
        String[] names = {
            "Anuja",
            "Vaishnavi",
            "Sonal",
            "Neha",
            "Subhdra",
            "Ankita"
        };
        boolean found = false;
        for (String n: names) {
            if (n.equalsIgnoreCase(name)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Valid Name");
        } else 
        {
            throw new InvalidNameException("Not a valid name");
        }
 
    }
 

    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = sc.next();
        CheckName ck = new CheckName();
        try {
            ck.validateName(name);
        } catch (InvalidNameException e) {
            System.out.println("Invalid Name " + e);
        }
    }
}

