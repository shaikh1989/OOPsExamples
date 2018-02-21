package sample;

public class armstrong {
	

	public static void main(String[] args)
	{
		int num=135,a,temp=0;
				int num1=num;
		
		while (num !=0)
		{
			a=num%10;
			temp= (a*a*a)+temp;
			num=num/10;
		}
		if(num1==temp)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstromg");
			
					
			
		}
		
				
				
			

	}

}
