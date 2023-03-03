import java.util.*;
/**
 *  One Line Star Pattern Print
 *      -
 */


public class OneLineStarPrint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        for (int i=0; i<=n; i++)
        {
            System.out.print("*");
        }
        System.out.println();

    }
}