/**
 *  Count the number of digits for a given number n
 *         Note:- n = 12356
 *
 *         Logic :-
 *          - Divide n by 10 until n>0 and count the number of divisions
 *
 */

public class CountDigits {
    public static void main(String[] args) {

        int n = 23;
        int countNum=0;

        while (n>0)
        {
            n/=10;
            countNum++;

        }
        System.out.println("There are numbers in n is: "+countNum);

    }
}
