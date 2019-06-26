package github;

public class If5 {
	public static void main(String args[]) {
		char a='9';
		if(a>=65 && a<=90 || a>=97 && a<=122) {
			System.out.println("Alphabet");
		}
		else if(a>=48 && a<=57){
			System.out.println("digit");
		}
		else {
			System.out.println("special character");
		}
	}

}
