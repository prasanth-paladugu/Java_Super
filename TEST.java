//EXAMPLE ON OBJECT CLASS
public class TEST									//EXTENDS OBJECT WILL BE THERE FOR EVERY INDIVIDUAL CLASS
{
	void m1()
	{
		System.out.println("M1");
	}
	public static void main(String[]args)
	{
		TEST ob=new TEST();
		ob.m1();
		/*ob.pp();*/								//CTE NO METHOD FOUND IN THE OBJECT
		System.out.println(ob.getClass());			//PRINTS CLASS NAME
		System.out.println(ob.hashCode());			//PRINTS OBJECT ADDRESS IN INTEGER VALUE
		System.out.println(ob.toString());			//PRINTS CLASS NAME AND ADDRESS IN HEXADECIMAL VALUE
		System.out.println(System.out.getClass());	//PRINTS CLASS NAME
		System.out.println(System.in.getClass());	//PRINTS CLASS NAME
	}
}