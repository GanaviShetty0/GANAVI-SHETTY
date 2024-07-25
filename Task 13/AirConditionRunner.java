class AirConditionRunner
{

public static void main(String[] args)
  {
	System.out.println("running main in AirCondition");
    AirCondition airCondition= new AirCondition();
	String ref=airCondition.cooling;
	float ref1=airCondition.temperature;
	int ref2=airCondition.manfdate;
	System.out.println("airCondition cooling:"+ref);
    System.out.println("airCondition temperature:"+ref1);
	System.out.println("airCondition manfdate:"+ref2);
	
	System.out.println("end main in AirCondition");
  }	
}