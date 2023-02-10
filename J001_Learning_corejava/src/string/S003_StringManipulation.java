package string;

public class S003_StringManipulation {
	public static void main(String[] args) {
		
		
		String str = "sun rises in east always";
		
		//east in rises sun
		//tsae ni sesir nus
		//nus sesir ni teae
		//east rises in sun
		
		
		String s[] =  str.split(" "); 
		
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");
		}
		
		System.out.println();
		System.out.println("*****************************");
		
		
		char ch[] = str.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		
		System.out.println();
		System.out.println("*****************************");
		
		for(int i= 0;i<s.length;i++)
		{
			char c[] =  s[i].toCharArray();
			for(int j=c.length-1;j>=0;j--)
			{
				System.out.print(c[j]);
			}
			System.out.print(" ");
		}
		
		System.out.println();
		System.out.println("*****************************");
		
		String temp = s[0];
		s[0] = s[s.length-1];
		s[s.length-1] = temp;
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		
		
		
	}
}
