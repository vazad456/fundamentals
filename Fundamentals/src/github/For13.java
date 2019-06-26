package github;

public class For13 {
	public static void main(String[] args) {

		int i,j,c;
		        
		        //Scanner in=new Scanner(System.in);
		        //int n=in.nextInt();
		        for(j=10;j<=99;j++)
		        {
		        c=0;
		        for(i=1;i<=j;i++)
		        {
		           	if(j%i==0)
		           	{
		           	c=c+1;
		           	}
		           	
		        }

		        if(c==2)
		       	System.out.println(j);

		        }
		        
		       
		}
}
