import java.util.Scanner;
public class CharNumver {
	public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a string");
        String input=scanner.nextLine();
        System.out.println(findChar(input));
    }
    static int findChar(String input){
        int count=0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i)!=' ')count++;
        }
        return count;
    }
}
