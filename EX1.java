//EXAMPLE ON SUPER KEYWORD FOR ACESSING PARENT CLASS VARIABLES IN CHILD CLASS
public class EX1									//MAIN CLASS
{
	public static void main(String[]arg)
	{
		TWO ob=new TWO();							//CREATING AN OBJECT AND ASSIGNING A REFERENCE TO OBJECT
		ob.set(100);								//CALLING A METHOD USING OBJECT
		ob.put(200);
		ob.showAll();
	}
}