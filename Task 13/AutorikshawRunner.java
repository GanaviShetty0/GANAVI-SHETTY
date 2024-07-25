class AutorikshawRunner
{

public static void main(String[] args)
  {
	System.out.println("running main in Autorikshaw");
    Autorikshaw autorikshaw= new Autorikshaw();
	String ref=autorikshaw.passangers;
	double ref1=autorikshaw.distance;
	 String ref2=autorikshaw.name;
	System.out.println("autorikshaw.passangers:"+ref);
    System.out.println("autorikshaw.name:"+ref1);
	System.out.println("autorikshaw.distance:"+ref2);
	
	System.out.println("end main in Autorikshaw");
  }	
}