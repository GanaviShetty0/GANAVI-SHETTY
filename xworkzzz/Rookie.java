class Laptop
{
  public static String company(String workName)
  {  
    System.out.println("running company in Rookie");
	 if(workName=="dataAnalyst")
	 {
		 String company="accenture";
		 System.out.println("workName is found");
	 }
	 return "work name is not found";
  }
  public static void street( String back)
  {
	System.out.println("running street in Rookie");
    if(back=="change")
    {
		System.out.println("back is found");
	}	
  }
  public static void hand(String arm )
  {
	System.out.println("running hand in Rookie");
	if(arm=="finger"){	  
	System.out.println("arm is found");
	return;
	}
	else
	{
		System.out.println("arm is not found");
        return;
	}
	   
  }
}