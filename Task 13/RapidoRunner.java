class RapidoRunner
{
	public static void main(String[] values)
	{
		System.out.println("running main in RapidoRunner ");
		Rapido rapido=new Rapido ();
		String ref=rapido.company;
		int ref1=rapido.passenger;
		double ref2=rapido.price;
		
		System.out.println("Rapido company :"+ref);
		System.out.println("Rapido passenger:"+ref1);
		System.out.println("Rapido price:"+ref2);
		
		
	    CabCompany cabCompany=new CabCompany ();
		String ref3=cabCompany.company;
		int ref4=cabCompany.passenger;
		double ref5=cabCompany.price;
		
		System.out.println("cabCompany company :"+ref3);
		System.out.println("cabCompany passenger:"+ref4);
		System.out.println("cabCompany price:"+ref5);
		
		BMTC bmtc=new BMTC ();
		int ref6=bmtc.busNo;
		int ref7=bmtc.passenger;
		double ref8=bmtc.price;
		
		System.out.println("bmtc busNo :"+ref6);
		System.out.println("bmtc passenger:"+ref7);
		System.out.println("bmtc price:"+ref8);
		
		FoodDeliveryCompany  foodDeliveryCompany =new FoodDeliveryCompany ();
		long ref9=foodDeliveryCompany.income;
		String ref10=foodDeliveryCompany. foodName;
		double ref11=foodDeliveryCompany .price;
		
		System.out.println("foodDeliveryCompany income:"+ref9);
		System.out.println("foodDeliveryCompany foodName:"+ref10);
		System.out.println("foodDeliveryCompany price:"+ref11);
		
		
		
		
		
		
		System.out.println("end main in RapidoRunner");
	}
}