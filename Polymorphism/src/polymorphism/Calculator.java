package polymorphism;

public class Calculator {
	public double add(double x,double y)
	{
		double z=x+y;
		System.out.println("The result is:"+z);
		return z;
	}
	
    //overloading
	public int add(int x,int y,int p)
	{
		int z=x+y+p;
		System.out.println("The result is:"+z);
		return z;
	}

}
