class NetmedsRunner
{
	public static void main(String[] data)
	{
		System.out.println("running main in NetmedsRunner");
		if(data.length==4)
		{
			String name= data[0];
			String manfdate= data[1];
			String price= data[2];
			double convertedPrice= Double.parseDouble(price);
			int convertedmanfdate= Integer.parseInt(manfdate);
			float convertedQuantity= Float.parseFloat(quantity);
			Netmeds.medicine(name,convertedmanfdate,convertedPrice,convertedQuantity);
				
		}
		else
		{
			System.out.println("not getting 4 reference in main method NetmedsRunner");
		}
	}
	
}