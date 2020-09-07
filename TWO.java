//TWO CLASS FOE EX1 ON SUPER KEYWORD FOR ACESSING PARENT CLASS VARIABLES IN CHILD CLASS
public class TWO extends ONE			//CHILD CLASSOF ONE CLASS
{
	int a;								//DECLARING VARIABLES
	public void put(int a)				//METHOD FOR SETTING DATA
	{
		this.a=a;
	}
	public void showAll()
	{
		System.out.println(this.a);		//this.a==>>TWO.a
		System.out.println(super.a);	//super.a==>>ONE.a
	}
}