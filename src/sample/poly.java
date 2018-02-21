package sample;

public class poly {
	
	public void add (int i, int j)
	{
		System.out.println("interger" + i+","+j);
	}
	public void add (long i, long j)
	{
		System.out.println("long" + i+","+j);
	}

	public void add (int i, long j)
	{
		System.out.println("interger and long" + i+","+j);
	}
	
	public static void main (String args[])
	{
	poly p= new poly();
	p.add(12l,14l);
	
	
	}
}
