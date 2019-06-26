package github;
import java.util.Scanner;
public class For18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner in=new Scanner(System.in);
		        int n=in.nextInt();
		        int reverse=0;
		        int temp=n;
		        while(n>0)
		        {
		        int digit=n%10;
		        reverse=(reverse*10)+digit;
		        n=n/10;
		        
		        }
		        if(temp==reverse)
		        {
		        System.out.println(temp+ " is palindrome");
		        }
		        else
		        {
		        System.out.println(temp+ " is Not palindrome");
		        }
		}
}
