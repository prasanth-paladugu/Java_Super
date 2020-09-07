//EXAMPLE ON CALLING PARENT CONSTRUCTER FROM CHILD CONSTRUCTER USING SUPER
class him											//USER DEFINED PARENT CLASS
{
	him()											//DEFAULT CONSTRUCTER
	{
		System.out.println("HIM");
	}
}
class her extends him								//USER DEFINED CHILD CLASS
{
	her()											//DEFAULT CONSTRUCTER
	{
		super();									//==>>him()
		System.out.println("HER");
	}
}
public class EX3									//MAIN CLASS
{
	public static void main(String[]args)
	{
		her ob=new her();
	}
}
