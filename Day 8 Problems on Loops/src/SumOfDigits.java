/**
 *  Find the sum of digits in a given number n.
 *
 *      Note: - n = 765
 *
 *      Logic:-
 *          -Last digit ko use kia add kia uske baad usi number ko uda dia
 *          -because if we don't extract that number after adding then it will be trapped in an infinite loop
 *          -because it will repeatedly add that particular number n times and it will never end
 *          -so to avoid that we need to extract after adding that number
 */

public class SumOfDigits {
    public static void main(String[] args) {

        int n = 765;
        int sum = 0;
        while (n>0)
        {
            sum += n%10;
            n/=10;
        }
        System.out.println("Sum of digits of n is: "+sum);

    }
}
