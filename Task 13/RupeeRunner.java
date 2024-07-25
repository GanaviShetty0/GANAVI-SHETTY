class RupeeRunner
{

public static void main(String[] args)
  {
	System.out.println("running main in RupeeRunner");
    Rupee rupee= new Rupee();
	String ref=rupee.place;
	int ref1=rupee.code;
	double ref2=rupee.change;
	System.out.println("rupee place:"+ref);
    System.out.println("rupee code:"+ref1);
	System.out.println("rupee change:"+ref2);
	
	System.out.println("end main in RupeeRunner");
  }	
}