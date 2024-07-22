class Country2
{
	public static void countryNameBackward(String[] states)
	{
		System.out.println("running CountryName in Country");
		for(int start=28-1;start>=0;start--)
		{
			String ref=states[start];
			System.out.println("states:"+states[start]);
			
		}
	}
	public static void countryNoBackWard(int[] pincode)
	{
		System.out.println("running CountryNo in Country");
		for(int start1=10-1;start1>=0;start1--)
		{
			int ref1=pincode[start1];
			System.out.println("pincode:"+pincode[start1]);
			
		}
	}
	public static void primeministerBackWard(String[] ministers)
	{
		System.out.println("running primemister in Country");
		for(int start2=14-1;start2>=0;start2--)
		{
		    String ref2=ministers[start2];
			System.out.println("ministers:"+ministers[start2]);
			
		}
	}
	
	public static void ministerNoBackWard(String[] cabinetministers)
	{
		System.out.println("running ministerNo in Country");
		for(int start3=30-1;start3>=0;start3++)
		{
		    String ref3=cabinetministers[start3];
			System.out.println("cabinetministers:"+cabinetministers[start3]);
			
		}
	}
	public static void chargerBackWard(String[] politicalparties)
	{
		System.out.println("running charger in politicalparties");
		for(int start4=5-1;start4>=0;start4--)
		{
		    String ref3=politicalparties[start4];
			System.out.println("politicalparties:"+politicalparties[start4]);
			
		}
	}
}