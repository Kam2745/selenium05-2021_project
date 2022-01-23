package Genius.QE.java;

import java.util.ArrayList;

public class Class2ArrayList {

	public static void main(String[] args) {
		/* Practice ArrayList with Genius
		*ArrayList:Multiple value or data store under 
		*one variable name which is not fixed.we can change,add
		*replace remove.we get ArrayList in java.util which connect with java library.
		
		 ArrayList<Datatype>Variable =new ArrayList<Datatype>();
		
		
		2.	Print out with for loop
	*/

	//	1.	Store 5 electronics name in ArrayList with try/catch method
		
		try {
		ArrayList<String>gadgets=new ArrayList<String>();
		gadgets.add("tv");
		gadgets.add("fridge");
		gadgets.add("oven");
		gadgets.add("ac");
		gadgets.add("mobile");
		
		
		
		for(int a=0;a<gadgets.size();a=a+1) {
			System.out.println(gadgets.get(a));
		}
		
		// 3.	Find out Access number 4 and print out	
		gadgets.get(4);
		System.out.println(gadgets.get(4));
		
	//	4.	Replace 3rd index with different electronic name and print
		
		gadgets.set(3, "fan");
		System.out.println(gadgets.set(3, "fan"));
		
	//  5.	Remove 2nd  product
		gadgets.remove(2);
		System.out.println(gadgets);
		
		
	//	6.	Print out the size
		gadgets.size();
		System.out.println(gadgets.size());
		
		}
		catch(Exception e) {
			System.out.println("mismatch");
		}
		
		

	}

}
