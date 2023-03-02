import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st num");
        int a = sc.nextInt();

        System.out.println("Enter 2nd Number");
        int b = sc.nextInt();

        System.out.println("1st Num is: "+a);
        System.out.println("2nd Num is: "+b);

        int sum = a+b;
        System.out.println("The sum is: "+sum);

    }
}
