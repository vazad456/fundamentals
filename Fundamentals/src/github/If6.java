package github;

public class If6 {
public static void main(String[] args) {
	String Gender = args[0];
	
	int age = Integer.parseInt(args[1]);
	 

    		if(Gender.equals("Male") || Gender.equals("Female"))
    		{
        		if(age>1 && age<=100)
        		{
            			if ((Gender.equals("Female")) && (age >= 1 && age <= 58)) 
			{
                			System.out.println("Interest is 8.2%");
            			}
 			else if ((Gender.equals("Female")) && (age >= 59 && age <= 100)) 
			{
                			System.out.println("Interest is 9.2%");
            			} 
			else if ((Gender.equals("Male")) && (age >= 1 && age <= 58)) 
			{
                			System.out.println("Interest is 8.4%");
            			} 
			else if ((Gender.equals("Male")) && (age >= 59 && age <= 100)) 
			{
                			System.out.println("Interest is 10.5%");
            			}
        		}
    		}
	}
}

