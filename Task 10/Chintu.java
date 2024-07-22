class Chintu
{
	public static String country(int code)
	{
	System.out.println("running country in Mirror");
	if(code==91)
	{
		return "india";
	}
	if(code==1)
	{
		return "USA";
	}
	if(code==44)
	{
		return"UK";
	}
	if(code==86)
	{
		return "china";
	}
	if (code==61)
	{
		return "Australia";
	}
	return "country not found";
	}
	public static double price (String item)
	{
	System.out.println("running price in Mirror");
    if(item=="washingMachine")
    {
		double price=100.0d;
		System.out.println("item:"+item);
		System.out.println("price:"+price);
		return price;
	}
    if(item=="kfc")
    {
		double price=200.0d;
		System.out.println("item:"+item);
		System.out.println("price:"+price);
		return price;
	}
    if(item=="burger")
    {
		double price=350.5d;
		System.out.println("item:"+item);
		System.out.println("price:"+price);
		return price;
	}
     if(item=="kabab")
    {
		double price=150.7d;
		System.out.println("item:"+item);
		System.out.println("price:"+price);
		return price;
	}
     if(item=="dosa")
    {
		double price=50.7d;
		System.out.println("item:"+item);
		System.out.println("price:"+price);
		return price;
	}
     return 0;	
	}
	public static String producerName(String movieName)
	{
		if(movieName=="jollyDays")
		{
			String producerName="hitha";
			System.out.println("movieName:"+movieName);
			System.out.println("producerName:"+producerName);
			return producerName;
		}
		if(movieName=="kgf")
		{
			String producerName="ganu";
			System.out.println("movieName:"+movieName);
			System.out.println("producerName:"+producerName);
			return producerName;
		}
		if(movieName=="kantara")
		{
			String producerName="anjali";
			System.out.println("movieName:"+movieName);
			System.out.println("producerName:"+producerName);
			return producerName;
		}
		if(movieName=="sarathi")
		{
			String producerName="janavi";
			System.out.println("movieName:"+movieName);
			System.out.println("producerName:"+producerName);
			return producerName;
		}
		if(movieName=="rajakumara")
		{
			String producerName="pitha";
			System.out.println("movieName:"+movieName);
			System.out.println("producerName:"+producerName);
			return producerName;
		}
		return "producerName not found";
		
		
		
		
	}
}