abstract class Main{
	int age = 24 ;
	String first_nam = "Md Khalid Hossain";
//	 abstract function 
	public abstract void absFunction();
}

class Students extends Main{
	final int graduationYeaar = 2018;
	
	public void absFunction() {
		System.out.println("This is abstract class");
	}
}

