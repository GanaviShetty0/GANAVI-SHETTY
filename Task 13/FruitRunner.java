class FruitRunner
{
	public static void main(String[] fun)
	{
		System.out.println("running main in FruitRunner");
		Fruit fruit=new Fruit ();
		String ref=fruit.company;
		String value=fruit.brand;
		double start=fruit.price;
		
		System.out.println("fruit.company :"+ref);
		System.out.println("fruit.brand:"+value);
		System.out.println("fruit.price:"+start);
		
		fruit.company="coco";
		String ref1=fruit.company;
		System.out.println("fruit company updated :"+ref1);
		
		fruit.brand="orange";
		String value1=fruit.brand;
		System.out.println("fruit brand updated :"+value1);
		
		fruit.price=156;
		double start1=fruit.price;
		System.out.println(" fruit price updated :"+start1);
		
		
		
		
		
		System.out.println("end main in FruitRunner");
	}
	
	
}