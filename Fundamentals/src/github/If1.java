

package github;

public class If1 {
	public static void main(String[] args) {
	int a=Integer.parseInt(args[0]);
	if(a==0) {
		System.out.println("zero");
	}
	else if(a>0){
		System.out.println("positive");
	}
	else {
		System.out.println("negative");
	}
		
	}
}
