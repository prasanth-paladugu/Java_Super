//SHE CLASS FOR EX4 ON CALLING PARENT CONSTRUCTER WITH ARGUMENTS FROM CHILD CONSTRUCTER WITH ARGUMENTS USING SUPER
public class SHE extends HE					//CHILD CLASS
{
	private int y;
	public SHE(int x,int y)					//CONSTRUCTER WITH PARAMETERS
	{
		super(x);							//HE(x)
		this.y=y;
	}
	public int getY()						//METHOD
	{
		return this.y;
	}
}
