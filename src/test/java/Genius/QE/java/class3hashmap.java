package Genius.QE.java;

import java.util.HashMap;

public class class3hashmap {

	public static void main(String[] args) {
		
     /*	Assignment about HashMap
      *1.	Store 5 student Id and name with try /catch method
      *2.	Access number 1 student name and print
      *3.	Remove 3rd student and print
       *4.	Print the size 
       *5.	Print all student id and name by using for loop. First separate id 
       * then separate name and then both together. And use any school name inside for loop.
*/
		
		try {
		
		HashMap<Integer,String>studentidname =new HashMap<Integer,String>();
		
		studentidname.put(01234, "ASHA");
		studentidname.put(01223, "SHETU");
		studentidname.put(01233, "FARIYA");
		studentidname.put(01333, "SHIMA");
		studentidname.put(01244, "KAMRUL");
		
		System.out.println(studentidname);
	//________________________________________________________________	
		studentidname.get(01234);
		
		System.out.println(studentidname.get(01234));
		
		
		
	//___________________________________________________________________________________
		
		studentidname.remove(01233);{
		System.out.println(studentidname);
		}
		
     //_________________________________________________________________________
		
		studentidname.size();
		System.out.println(studentidname.size());
		
		
     //___________________________________________________________________
		
		
		for(Integer i:studentidname.keySet())
			System.out.println(i);
		
			
       for(String j: studentidname.values())
    	   System.out.println(j);
       
       
       for(Integer k: studentidname.keySet())
    	   System.out.println("MHS"+" " + k + " " + studentidname.get(k));
		
		
		
		}
		catch(Exception e) {
			System.out.println("NOT A STUDENT");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
