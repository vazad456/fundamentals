package github;
import java.util.Scanner;
public class For15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner in=new Scanner(System.in);
		        int n=in.nextInt();
		        int sum=0,i;
		        for(;n>0;)
		        {
		        i=n%10;
		        sum=sum+i;
		        n=n/10;
		        }
		        System.out.println(+sum);
		}
}
