package Genius.QE.java;

public class javaoopsclass {

	public double d=10.5;
	
	String bird ="macaw";
	
	public void soda () {
		System.out.println("coke");
	}
	
	public static void universityname() {
		System.out.println("AIUB");
	}
	protected void family() {
		System.out.println("RUSHDA");
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		universityname();
		
		
		javaoopsclass hasan =new javaoopsclass();
		
		System.out.println(hasan.bird);
		System.out.println(hasan.d);
		hasan.soda();
	    hasan.family();
	
		
	}

}
