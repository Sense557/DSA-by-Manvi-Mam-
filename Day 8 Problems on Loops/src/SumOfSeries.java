import java.util.Scanner;

/**
 *  Find the sum of the following series
 *      - Note:- series s= 1-2+3-4......n
 */




public class SumOfSeries {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;

        for (int i=1; i<= n; i++)
        {
            if(i%2==0)
            {
                ans -=i;
            }
            else
            {
                ans +=i;
            }
        }
        System.out.println(ans);


    }
}
