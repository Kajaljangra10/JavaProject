import java.util.*;

public class prime {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the no.");	
		int n=src.nextInt();
		int i=2;
		for(i=2;i<=Math.sqrt(n);i++)	
		{
			if(n%i==0)
			{
				System.out.println("not prime");
				break;
			}
		}
			if(i>Math.sqrt(n))
			{
				System.out.println("prime");
			}
				
		
	}

}
