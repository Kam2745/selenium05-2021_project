package geniusjavareview;

import java.util.ArrayList;
import java.util.HashMap;

public class reviewclass1 {

	public static void main(String[] args) {
		
		// datatype variable =value;

		
		int a=10;
		double b=5.5;
		char c='A';
		String d ="JOSEY CELLULAR";
	   
		//addition
        double total =a+b;
        System.out.println(total);
        
        //subtraction
        double total1=a-b;
        System.out.println(total1);
        
        //multiplication
        
        double result =a*b;
        System.out.println(result);
        
        //division
        double result1 =a/b;
        System.out.println(result1);
     //__________________________________________________________________________________
      //variable = variable +incremented value
        
        //increment by 5
        
        a=a+5;
        System.out.println(a);
        
        //variable=variable-decremented value
        
        //decrement by 4
        
        a=a-4;
        System.out.println(a);
        
       /*Different type of SYMBOL in java
        * == means equal
        * && means and
        * > greater then 
        * < less then 
        * >= greater then equal
        * <= less then equal
        * != not equal
        * || means or
        */
                
        //______________________________________________________________________________-
        
        /*for loop Syntax: for(statement1,statement2,statement3){
         
        *Systeem.out.println();
	}
		
	*/	
		
	/*	if else syntax:
	if(condition) {
		System.out.println();
		else {
			System.out.printpl();
		}
	*/	
        
     //if your mark is more then 90 then print A,if mark is more then 80 then print B otherwise print c   
     //if you have $600 or more then buy iphone,if you have less then 600 but more then 400 then buy samsung ,
        //if you  have less then 400 and more then 200 then buy lg otherwise buy an icecream.   
       int mark=78;
       if(mark>90) {
    	   System.out.println("A");
    	   
       }
       else if(mark>80){
    	   System.out.println("B");
       }        
       else {
    	   System.out.println("C");
       }
        
	/*If else
      * If the earthquake rating is  8.00 or grater then print “great”

       *If the earthquake rating is  7.0 to 7.9  then print “major “

       *If the earthquake rating is  6.1 to 6.9 then print “ strong”

       *If the earthquake rating is  5.5 to 6.0 then print “moderate”

       *If the earthquake rating is  2.5 to 5.4 then print “ minor”

       *If the earthquake rating is  less then 2.4 ,then print “ rating can not be record”
		*/
		
		double earthquake =5.7;
		
           if(earthquake>=8.00) {
	          System.out.println("great");
              }
           else if(earthquake>=7.00) {
	          System.out.println("major");
              }

           else if(earthquake>=6.1) {
   			System.out.println("strong");
   		     }
   		   else if(earthquake>=5.5) {
   			System.out.println("moderate");
   		     }
	
           else if(earthquake>=2.5) {
   			System.out.println("minor");
   		     }
   		    else  {
   			System.out.println("rating cannot be recorded");
   		      }
	
	//1.9 If else’s condition
      //     If the mark greater than or equal to 75, then print the student is intelligent
         //  If the mark greater than or equal to 35 then print the student is average
           //Otherwise the student is full.
          // If possible find the gender too
	
	
	
           int marks = 98;
	
	
	if (marks>=75) {
		System.out.println("intellegent");
	}
	else if (marks>=35) {
		System.out.println("average");
	}
	else {
		System.out.println("full");
	}
	
//___________________________________________________________________________________________________

	
	//Array syntax: datatype [] variable ={"'value1,"'value2};
	
	//store 5 kids fun place in array
	
	String [] kidsplace = {"chukeches","gamestop","kidmania","toysrus","thetoystore"};
	
	System.out.println(kidsplace[2]);
	
	
	//when we will replace the value then we will do it with other value
	//variable[index number] ="new value";	
	
	kidsplace [3] ="zoo";
	
	System.out.println(kidsplace [3]);
	
	
	System.out.println(kidsplace.length);
	
	
	
	//add 4 student id in the class
	
	int [] studentid = {12,23,34,45};
	
	studentid [2]=55;
	System.out.println(studentid [2]);
	
	System.out.println(studentid.length);
	
	//if asha's bp is more then 110 then print "high pressure"
	//if asha's bp is more then 80 then print "normal"
	//otherwise print asha is "asha need rest, come to the group study"
	
	int bp=78;
	if(bp>110) {
		System.out.println("high pressure");
		}
		else if(bp>80) {
			System.out.println("normal");
		}
			else {System.out.println("asha need rest, come to the group study");
			
			
		}
	// store 4 beach name in array
	
	String [] beach = {"jonsbeach","marybeach","sandybeach","floridabeach"};
	
	System.out.println(beach);
	
	System.out.println(beach[2]);
	
	beach[0] ="miamibeach";
	
	System.out.println(beach[0]);
	
	System.out.println(beach.length);
	
	
	//____________________________________________________________________
	
	//Syntax for ArrayList:  ArrayList<datatype>variable =new ArrayList <datatype>();
	
	//add 5 kids place in ArrayList
	
	ArrayList<String>kids =new ArrayList<String>();
	kids.add("zoo");
	kids.add("fungame");
	kids.add("gamestop");
	kids.add("chuckichees");
	kids.add("centralpark");
	
	System.out.println(kids);
	
	kids.get(0);
	
	System.out.println(kids.get(0));
	
	kids.set(4, "wonderland");
	
	System.out.println(kids.set(4, "wonderland"));
	
	kids.size();
	System.out.println(kids.size());
	
	kids.remove(2);
	System.out.println(kids);
	
	//add 4 new student name id in the class in Array
	
	ArrayList<Integer> id=new ArrayList<Integer>();
	id.add(123);
	id.add(222);
	id.add(333);
	id.add(444);
	
	System.out.println(id);
	
	id.get(3);
	System.out.println();
	
	
	
	
	//ADD 6 STATE(capital name must be include) NAME IN USA USING ArrayList
	
	ArrayList<String>state =new ArrayList();
	state.add("newyork");
	state.add("vergenia");
	state.add("texas");
	state.add("florida");
	state.add("washingtondc");
	state.add("california");
	
	
	//Access the capital of USA
	state.get(4);
	System.out.println(state.get(4));
	
	//REplace any state name with other state
	
	state.set(0, "delwar");
	System.out.println(state.set(0,"delwar"));
	
	//REMOVE THE CAPITAL  from USA
	
	
	state.remove(4);
	System.out.println(state);
	
	//print total size of the ArrayList.
	
	state.size();
	System.out.println(state.size());
	
	//for(int newvariable=0;newvariable<variable.size();newvariable++) {
	//	System.out.println(variable.get(newvariable));
	//}
	
	for(int state1=0;state1<state.size();state1++){
		
		System.out.println(state.get(state1));
	}
	
	//________________________________________________________________________
	
	//Syntax of HashMap : HashMap<datatype,datatype>variable=new HashMap<datatype,datatype>();
	
	
	
// store 4 car year and model in HashMap
	
	HashMap<Integer,String>car=new HashMap<Integer,String>();
	
	car.put(2019,"BMW7" );
	car.put(2022, "TESLASUPERIOR");
	car.put(2021, "TOYOTA CAMRY");
	car.put(2020, "LEXASXTRAIL");
	
	System.out.println(car);
	
	car.get(2021);
	System.out.println(car.get(2021));
	
	car.remove(2020);
	System.out.println(car);
	
	car.put(2018, "mazda");
	System.out.println(car);
	
	car.size();
	
	for(int r:car.keySet()) {
		
		System.out.println(r);
	}
	
	for(String s: car.values()) {
		System.out.println(s);
	}
	
	for(int r: car.keySet()) {
		System.out.println("mycar "  +  r  + " " +car.get(r));
	}
	
	
	
	
	/* Store 5 Actor and Actress name from Bangla cinema
	 * Access your favorite couple from the list
	 * use for loop 
	 */
	
	
	HashMap<String,String>cinema =new HashMap<String,String>();
	cinema.put("razzak","bobita");
	cinema.put("alamgir","shabana");
	cinema.put("joshim","onjughosh");
	cinema.put("kanchon","diti");
	cinema.put("salmanshah","sabnur");
	
	cinema.get("razzak");
	System.out.println(cinema.get("razzak"));
	
	for(String x:cinema.keySet()) {
		System.out.println(x);
	}
		for(String y:cinema.values()) {
			System.out.println(y);
			
		}
	      for(String z:cinema.keySet()) {
	    	  System.out.println("best juti in bangla cinema " +  z  + " " + cinema.get(z));
	      }
	
	
	
	
	
	
	
	
	
	}	

}
