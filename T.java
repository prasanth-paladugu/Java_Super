//T CLASS FOE EX2 ON SUPER KEYWORD FOR ACESSING PARENT CLASS METHODS FROM CHILD CLASS
public class T extends O				//CHILD CLASS OF O CLASS
{
	public void m1()					//METHOD FOR PRINTING DATA
	{
		super.m1();						//CALLING m1 METHOD OF PARENT CLASS(O CLASS)
		System.out.println("M1 METHOD OF T CLASS");
	}

}