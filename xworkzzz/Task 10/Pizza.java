class Pizza
{
  public static String company(String workName)
  {  
    System.out.println("running company in Pizza");
	 if(workName=="dataAnalyst")
	 {
		 String company="accenture";
		 System.out.println("workName is found");
	 }
	 return "work name is not found";
  }
  public static String street( String back)
  {
	System.out.println("running street in Pizza");
    if(back=="change")
    {
		System.out.println("back is found");
		return "back";
	}
    else
    {
		System.out.println("back is not found");
		return "back";
	}	
	
  }
  public static void hand(String arm )
  {
	System.out.println("running hand in Pizza");
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