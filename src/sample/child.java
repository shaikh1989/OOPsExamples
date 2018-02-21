package sample;
import java.lang.*;


public class child extends parent
{

	child()
	{
	System.out.println("child");
	
	}
	 child(String str)
	 {
		 super.add();
		 System.out.println(str);
	 }
public void add()
{
	System.out.println("child added");
	
	
}
public static void main(String args[])

{
	child ch=new child("shaikh");
	ch.add();
			
}
}

