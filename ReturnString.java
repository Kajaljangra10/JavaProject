
import java.util.Scanner;
	 
	public class ReturnString {
		String display() //method
		{
			
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the string ");
		  String inputString = sc.nextLine();
		  if (inputString.length() > 4) {
	            String ExceptLast4 = inputString.substring(0, inputString.length()-4);
	            String repeatString = "X".repeat(ExceptLast4.length());
	            repeatString +=  inputString.substring(inputString.length()-4);
	            System.out.println(repeatString);
	        }
	        else {
	            System.out.println("Entered string must be greater than 4.");
	        }
		  sc.close();
		  return toString();
	         
	    }
	 
	    public static void main(String[] args)  {
	    
	    	ReturnString obj=new ReturnString();
	    	obj.display();//method is calling
	    	
	 
	       
	         
	    }
	 
	}
