import java.util.Scanner;

public class Assign {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= scanner.nextInt();
        if(n<0 || n>19){
            System.out.println("You can enter number between 0 to 20");
        }
        else {
        while (n>=0 && n<20){
        System.out.println(fac(n));
        System.out.println("Enter number again");
        n= scanner.nextInt();
            if(n<0 || n>19){
                System.out.println("Entered wrong number, Program terminated");
            }
        }
        }
    }
    static int fac(int n){
        if(n==0)return 1;
        return n*fac(n-1);
    }

}