import java.util.*;

// FUNCTIONS
// returnType functionName(type arg1, type arg2, ...){
// operation }

// METHODS
// -user defined
// -inbuilt methods

// =====================================================================================================

// public class Functions {
//     public static void printMyName(String name) {
//         System.out.println(name);
//         return; // exit function
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();

//         printMyName(name); // calling function
//     }
// }

// =====================================================================================================

// ADD 2 NUMBERS AND RETURN THE SUM

// public class Functions {
//     public static int calcSum(int a, int b) {
//         int sum = a + b;
//         return sum; // exit function
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first number: ");
//         int a = sc.nextInt();
//         System.out.println("Enter second number: ");
//         int b = sc.nextInt();

//         int sum = calcSum(a, b);
//         System.err.println("Sum is: " + sum);
//     }
// }

// =====================================================================================================

// FACORIAL OF A NUMBER, n

// public class Functions {
//     public static int factorial(int n) {
//         int f = 1; // initialisation always starts with 1 in multiplication

//         for (int i = 1; i <= n; i++) {
//             f = f * i;
//         }
//         return f; // factorial of n
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int n = sc.nextInt();
//         System.out.println("Factorial of " + n + " is " + factorial(n));
//     }
// }

// =====================================================================================================

// BINOMIAL COEFFICIENT
// nCr = n!/r!(n-r)!

public class Functions {

    // Factorial
    public static int factorial(int n) {
        int f = 1; // initialisation always starts with 1 in multiplication

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f; // factorial of n
    }

    // Binomial Coefficient
    public static int binoCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int binoCoeff = fact_n / (fact_r * fact_nmr);

        return binoCoeff;
    }

    public static void main(String args[]) {
        System.out.println(binoCoeff(5, 2));
    }
}

// =====================================================================================================
