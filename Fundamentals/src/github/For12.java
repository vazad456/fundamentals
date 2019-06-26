package github;
import java.util.Scanner;
public class For12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        int i;
		        int c=0;
		        Scanner in=new Scanner(System.in);
		        int n=in.nextInt();
		        for(i=1;i<=(n);i++)
		        {
		           	if(n%i==0)
		           	{
		           	c=c+1;
		           	}
		           	

		        }

		        if(c>2)
		       	{
		       	System.out.println("Not a prime number");
		       	}
		       else
		       	{
		       	System.out.println("prime number");
		       	}
		       
		}
}
