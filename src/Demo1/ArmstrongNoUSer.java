package Demo1;
import java.io.*;
public class ArmstrongNoUSer {

	public static void main(String[] args) throws Exception {
		int x=153;
		int sum=0,rem;
		System.out.println("Enter the number::");
		DataInputStream dis= new DataInputStream(System.in);
		String msg=  dis.readLine();
	x=Integer.parseInt(msg);
		
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
