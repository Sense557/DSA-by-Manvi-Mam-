import java.util.Scanner;

/**
 *  Print the first n factorial numbers
 *      Note:-
 *          - 1! = 1
 *          - 2! = 2*1
 *          - 3! = 3*3*1
 *          - 4! = 4*3*2*1
 *          - 5! = 5*4*3*2*1
 */



public class FirstNFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fact =1;

        for(int i=1; i<=n; i++)
        {
            fact*=i;
            System.out.println("factorial of number "+i+" is: "+fact);
        }
    }
}
