class ForestRunner
{
  public static void main(String[] information)
  {
	System.out.println("running main in ForestRunner");
    if( information.length==4)
     {
	  System.out.println("getting 4 referance from main method arguments");
      String name = information[0];
      String area = information[1];	 
	  String eshtablishedYear = information[2];
      String state = information[3];

       System.out.println("name:"+name);
      System.out.println("area:"+area);
      System.out.println("eshtablishedYear:"+eshtablishedYear);
      System.out.println("state:"+state);	 
	}
    else
    {
		System.out.println("not getting 4 referance from main arguments");
	}		
	  
  }  
	
}