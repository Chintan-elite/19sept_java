package oops;

class Calc1
{
	int a=10;
	int b=20;
	public void add(int a, int b)
	{
		this.a = a;
		this.b = b;
		int r  =a+b;
		System.out.println("Addion is 1: "+r);
	}
	
	public void add(int a, int b, int c)
	{
		int r  =this.a+this.b+c;
		System.out.println("Addion is 2: "+r);
	}
	
	public void add(int a, double b)
	{
		double r  =a+b;
		System.out.println("Addion is 3: "+r);
	}
	
	
}

public class O008_OverLoading {
	public static void main(String[] args) {
		
		
		Calc1 c = new Calc1();
		c.add(100, 200);
		c.add(10, 22,10);
		c.add(10, 20.22);
	}
}
