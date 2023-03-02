import java.util.Scanner;

/**
 * Try this
 *      - Print "Odd" if the input value is odd, Otherwise print "even".
 *      - Note: Input value is between 1 and 10^6.
 */







public class OddEven {
    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number 1 and 10^6.");
        int num = sc.nextInt();


        if(num%2 == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }

    }
}
