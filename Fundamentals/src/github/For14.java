package github;
import java.util.Scanner;
public class For14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int i,c=0;
		        Scanner in=new Scanner(System.in);
		        int n=in.nextInt();
		        if(n==0 || n==1)
		        {
		        System.out.println(n+" "+" is neither prime nor composite");
		        }
		        else
		        {
		        for(i=1;i<=(n);i++)
		        {
		           	if(n%i==0)
		           	{
		           	c=c+1;
		           	}
		           	

		        }

		        if(c>2)
		       	{
		       	System.out.println(n+" is not prime number");
		       	}
		       else
		       	{
		       	System.out.println(n+" is prime nusmber");
		       	}
		        }
		       
		}
}
