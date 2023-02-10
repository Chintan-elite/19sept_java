package oops;

abstract class Abs
{
	public abstract void display();
	
	public void run()
	{
		System.out.println("runinng run");
	}
}

class AbsImpl extends Abs
{

	@Override
	public void display() {
		System.out.println("running display");
		
	}
	
}

public class O009_abstractDemo {
	public static void main(String[] args) {
		
		//Abs a = new Abs();
		
		AbsImpl i = new AbsImpl();
		i.display();
		i.run();
		
		
	}
}
