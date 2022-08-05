public class CharCount {

	public static void main(String[] args) {
	String str = "Count the Charaters";    
	        int count = 0;    
	            
	        //Counts each character except space    
	        for(int i = 0; i < str.length(); i++) {    
	            if(str.charAt(i) != ' ')    
	                count++;    
	        }    
	        System.out.println("Total no. of characters = " + count);    
	}
}
