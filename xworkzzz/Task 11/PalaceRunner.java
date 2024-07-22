class PalaceRunner
{
	public static void main(String[] information)
	{
		System.out.println("running main in PalaceRunner");
		if(information.length==4)
		{
			System.out.println("getting 4 referance in main method arguments");
			String name= information[0];
			String location= information[1];
			String builtIn= information[2];
			String builtYear= information[3];
			
			System.out.println("name:"+name);
			System.out.println("location:"+location);
			System.out.println("builtIn:"+builtIn);
			System.out.println("builtYear:"+builtYear);
		}	
		else
		{
			System.out.println("not getting 4 referance in main method arguments");
		}
	}
}