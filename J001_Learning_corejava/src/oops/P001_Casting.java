package oops;
class Sample
{
	public void display()
	{
		System.out.println("runing display..");
	}
}
class Run extends Sample
{
	public void run()
	{
		System.out.println("running run method...");
	}
}
public class P001_Casting {
	public static void main(String[] args) {
		
		//wideninig //implicite
		int a = 10;
		long l = a;
		
		//nerrowing  //explicite
		long k = 120;
		int k1 = (int) k;
		
		
		
		//Run r = new Run();
		//Sample s = new Sample();
		
		
		//upcasting
		Sample s = new Run();
		
		//downcasting
		//Run r = (Run) new Sample();
		
		System.out.println(new Run() instanceof Sample);
		System.out.println(new Sample() instanceof Run);
		
//		O006_Modifier o = new O006_Modifier();
//		o.a = 50;
//		o.b =50;
//		o.display();
		
		
	}
}
