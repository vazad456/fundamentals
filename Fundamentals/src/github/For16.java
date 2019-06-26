package github;
import java.util.Scanner;
public class For16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reverse=0;
		        Scanner in=new Scanner(System.in);
		        int n=in.nextInt();
		        while(n!=0)
		        {
		        int digit=n%10;
		        reverse=reverse*10+digit;
		        n=n/10;
		        }
		        System.out.println("reverse of digit"+reverse);
		}

}
