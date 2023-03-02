import java.util.Scanner;

/**
 * TakingInput
 */

public class TakingInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a = sc.nextInt();

        System.out.println("Enter 2nd Number");
        int b = sc.nextInt();

        System.out.println("1st Number is: "+a);
        System.out.println("2nd Number is: "+b);

        int sum = a+b;
        System.out.println("sum is: "+sum);

        sc.close();
        
    }
}