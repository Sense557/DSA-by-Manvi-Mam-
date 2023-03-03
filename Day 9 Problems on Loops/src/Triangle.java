import java.util.Scanner;

/**
 *  Ascending Triangle Pattern
 *      Logic -
 *          Row = column
 *
 *                1  *
 *                2  **
 *                3  ***
 *                4  ****
 *                5  *****
 *                6  ******
 */



//public class Triangle {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int r = sc.nextInt();
//
//        for (int i=0; i<=r; i++)
//        {
//            for (int j=0; j<=i; j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }
//}


//💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡


/**
 *  Descending Triangle Pattern
 *      Logic -
 */



//public class Triangle {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int r = sc.nextInt();
//
//
//        for (int i=0; i<=r-1; i++)
//        {
//            for (int j=0; j<=r-1; j++)
//            {
//                if(i==0 || j==0 ||i+j<=r-1)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}


//💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡


/**
 *  Triangle Pattern
 *      Logic -
 */

//public class Triangle {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int r = sc.nextInt();
//
//
//        for (int i=0; i<=r-1; i++)
//        {
//            for (int j=0; j<=r-1; j++)
//            {
//                if(i==0 || j==0 ||i+j<=r-1)
//                {
//                    System.out.print(" ");
//                }
//                else
//                {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
//    }
//}



//💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡


/**
 *  Equilateral Triangle Pattern
 *      Logic -
 */

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int r = sc.nextInt();


        for (int i=0; i<=r-1; i++)
        {
            for (int j=0; j<=r-1; j++)
            {
                if(i==0 || j==0 ||i+j<=r-1)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            for (int j=0; j<=r-1; j++)
            {
                if(i==r-1 ||i>=j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}