class AutoDriverRunner
{
	public static void main(String[] values)
	{
		System.out.println("running main in AutoDriver ");
		AutoDriver autoDriver=new AutoDriver ();
		String ref=autoDriver.autoName;
		int ref1=autoDriver.passenger;
		double ref2=autoDriver.price;
		
		System.out.println("AutoDriver autoName :"+ref);
		System.out.println("AutoDriver passenger:"+ref1);
		System.out.println("AutoDriver price:"+ref2);
		
		System.out.println("end main in AutoDriver");
	}
}