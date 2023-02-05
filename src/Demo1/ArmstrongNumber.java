package Demo1;

import java.io.DataInputStream;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int x=153;
		int sum=0,rem;
		
		
		int no=x;
		while(x!=0)  
		{
			rem=x%10; 
			x=x/10; 
			sum=sum+rem*rem*rem;
		}
		if (no==sum)
		{
		System.out.println("Armstrong Number");	
		}  else
		{
			System.out.println("Not Armstrong Number");
		}
	}

	}


