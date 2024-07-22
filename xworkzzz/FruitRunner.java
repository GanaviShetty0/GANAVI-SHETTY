class FruitRunner
{
  public static void main(String[] data)
  {
	  System.out.println("running main in FruitRunner");
	  if(data.length==5)
	  {
		  String name= data[0];
		  String brand= data[1];
		  String flavour= data[2];
		  String price= data[3];
		  String quantity= data[4];
		  double convertedprice= Double.parseDouble(price);
		  float convertedquantity= Float.parseFloat(quantity);
		  Fruit.juice(name,brand,flavour,convertedprice,convertedquantity);
		  
	  }
	  else
	  {
		  System.out.println("not getting 4 referance main in FruitRunner");
	  }
  }  
}