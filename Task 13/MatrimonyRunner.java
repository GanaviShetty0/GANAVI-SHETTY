class MatrimonyRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in aircondition");
		Matrimony matrimony=new Matrimony ();
		boolean ref=matrimony.married;
		String value=matrimony.brand;
		int start=matrimony.employees;
		
		System.out.println("matrimony married :"+ref);
		System.out.println("matrimony brand:"+value);
		System.out.println("matrimony employees:"+start);
		
		matrimony.married=true;
		boolean ref1=matrimony.married;
		System.out.println("matrimony married updated :"+ref1);
		
		matrimony.brand= "BharatMatrimony";
		String value1=matrimony.brand;
		System.out.println("matrimony brand updated :"+value1);
		
		matrimony.employees=4000;
		int start1=matrimony.employees;
		System.out.println("matrimony employees updated :"+start1);
		
		
		
		
		
		System.out.println("end main in aircondition");
	}
}