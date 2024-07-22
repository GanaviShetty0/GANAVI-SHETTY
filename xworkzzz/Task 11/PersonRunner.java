class PersonRunner
{
	public static void main (String[] information)
	{
		System.out.println("running main in PersonRunner");
		if(information.length==4)
		{
			System.out.println("getting 4 reference from main method arguments");
			String name= information[0];
			String email= information[1];
			String age= information[2];
			String password= information[3];
			
			System.out.println("name:"+name);
			System.out.println("email:"+email);
			System.out.println("age:"+age);
			System.out.println("password:"+password);
			
			
		}
		else
		{
			System.out.println("not getting 4 reference from main method arguments");
		
		}
		
	}
}