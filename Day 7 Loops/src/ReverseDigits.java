/**
 *  Reverse the digits of a number
 *      Note:- n = 2346
 *
 *      Logic:-
 *          - first we have ans is "0"
 *          - we multiply (ans)*10+(last digit)
 *          - every iteration we need to change the number i.e. remove last digit from that number
 *          - else will be trapped in an infinite loop
 */


public class ReverseDigits {
    public static void main(String[] args) {

        int n = 123456;
        int ans = 0;

        while (n>0)
        {
            ans= ans*10+n%10;
//            Why it is not working?
//            Because in this line we are not only multiplying  we are adding and doing modulo operation as well
//            so this short hand type not working  no need to worry about
//            ans*=10+n%10;
            n/=10;

        }
        System.out.println("after Reversing the number is: "+ans);
    }
}
