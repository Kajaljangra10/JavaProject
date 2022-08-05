
public class AverageofArray {

	public static void main(String[] args) {
		int[] array= new int[] {2,4,8,6,14,22};
		int sum= 0;
		
		// Calculate sum of all array elements
		for(int i=0;i<array.length;i++) 
		sum += array[i];
		
		// Calculate average value
		double avg= sum/array.length;
		System.out.println("The average value of array is "+ avg);

	}

}
