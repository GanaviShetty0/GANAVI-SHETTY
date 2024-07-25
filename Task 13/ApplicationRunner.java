class ApplicationRunner
{
	public static void main(String[] fun)
	{
		System.out.println("running main in ApplicationRunner");
		Application application=new Application ();
		String ref=application.name;
		double value=application.price;
		int start=application.data;
		
		System.out.println("application name :"+ref);
		System.out.println("application price:"+value);
		System.out.println("application.data:"+start);
		
		application.name="snapchat";
		String ref1=application.name;
		System.out.println("application.name updated :"+ref1);
		
		application.price=500;
		double value1=application.price;
		System.out.println("application.priceupdated :"+value1);
		
		application.data=15;
		int start1=application.data;
		System.out.println(" application.data updated :"+start1);
		
		
		
		
		
		System.out.println("end main in ApplicationRunner");
	}
	
	
}