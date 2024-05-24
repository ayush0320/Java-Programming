import java.util.*;

// FUNCTIONS
// A method is a block of code which only runs when it is called.
// You can pass data, known as parameters, into a method.
// Methods are used to perform certain actions, and they are also known as functions.
// Why use methods? To reuse code: define the code once, and use it many times.

// returnType functionName(type arg1, type arg2, ...){
//      body;
//      return Statement;
// }

// METHODS
// -user defined
// -inbuilt methods

//======================================================================================================

// public class Functions {
//     public static void printMyName(String name) {  //parameters or formal parameters
//         System.out.println(name);
//         return; // exit the function
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();

//         printMyName(name); // calling function, arguments or actual parameters
//     }
// }

//======================================================================================================

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

//======================================================================================================

// CALL BY VALUE
// call by value passes a copy of the variable to the method
// all changes are reflected only in that method
// no changes are reflected in the main method
// Java always calls by value

// CALL BY REFERENCE
//  a way of passing the arguments to a function by copying the address of the argument in the formal parameter

// public class Functions {

//     public static void swap(int a, int b) {
//         int temp = a;
//         a = b;
//         b = temp;

//         System.out.println("a = " + a);
//         System.out.println("b = " + b);
//     }

//     public static void main(String args[]) {
//         swap(5, 10);
//     }
// }

// ======================================================================================================

// FIND PRODUCT OF A & B

public class Functions {

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String args[]) {
        int a = 7;
        int b = 3;
        int prod = multiply(a, b);
        System.out.println("Product of " + a + " & " + b + " is " + prod);
    }
}

// ======================================================================================================

// FACORIAL OF A NUMBER, n

// public class Functions {
// public static int factorial(int n) {
// int f = 1; // initialisation always starts with 1 in multiplication

// for (int i = 1; i <= n; i++) {
// f = f * i;
// }
// return f; // factorial of n
// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number: ");
// int n = sc.nextInt();
// System.out.println("Factorial of " + n + " is " + factorial(n));
// }
// }

// ======================================================================================================

// BINOMIAL COEFFICIENT
// nCr = n!/r!(n-r)!

// public class Functions {

// // Factorial
// public static int factorial(int n) {
// int f = 1; // initialisation always starts with 1 in multiplication

// for (int i = 1; i <= n; i++) {
// f = f * i;
// }
// return f; // factorial of n
// }

// // Binomial Coefficient
// public static int binoCoeff(int n, int r) {
// int fact_n = factorial(n);
// int fact_r = factorial(r);
// int fact_nmr = factorial(n - r);

// int binoCoeff = fact_n / (fact_r * fact_nmr);

// return binoCoeff;
// }

// public static void main(String args[]) {
// System.out.println(binoCoeff(5, 2));
// }
// }

// ======================================================================================================

// FUNCTION OVERLOADING
// An overloaded function is really just a set of different functions that
// happen to have the same name
// With number of Parameters

// public class Functions {

// // func to calc sum of 2 nums
// public static int sum(int a, int b) {
// return a + b;
// }

// // func to calc sum of 3 nums
// public static int sum(int a, int b, int c) {
// return a + b + c;
// }

// public static void main(String args[]) {
// System.out.println(sum(3, 5));
// System.out.println(sum(5, 2, 1));
// }
// }

// ------------------------------------------------------------------------------------------------------

// Using Data Types

// public class Functions {

// // func to calc sum of 2 nums
// public static int sum(int a, int b) {
// return a + b;
// }

// // func to calc sum of 3 nums
// public static float sum(float a, float b) {
// return a + b;
// }

// public static void main(String args[]) {
// System.out.println(sum(3, 5));
// System.out.println(sum(3.2f, 4.8f));
// }
// }

// ======================================================================================================

// CHECK IF A NUMBER IS PRIME

// public class Functions {

// public static boolean isPrime(int n) {

// for (int i = 2; i <= n - 1; i++) {
// if (n % i == 0) { //completely dividing
// return false;
// }
// }
// return true;
// }

// // func to calc sum of 3 nums
// public static float sum(float a, float b) {
// return a + b;
// }

// public static void main(String args[]) {
// System.out.println(isPrime(5));
// }
// }

// ------------------------------------------------------------------------------------------------------
// OPTIMIZED

// public class Functions {

// public static boolean isPrime(int n) {

// for (int i = 2; i <= Math.sqrt(n); i++) {
// if (n % i == 0) { // completely dividing
// return false;
// }
// }
// return true;
// }

// public static void main(String args[]) {
// System.out.println(isPrime(5));
// }
// }

// ======================================================================================================

// PRINT ALL PRIMES IN A RANGE

// public class Functions {

// public static boolean isPrime(int n) {

// for (int i = 2; i <= Math.sqrt(n); i++) {
// if (n % i == 0) { // completely dividing
// return false;
// }
// }
// return true;
// }

// public static void primesInRange(int n) {

// for (int i = 2; i <= n; i++) {
// if (isPrime(i)) {
// System.out.print(i + " ");
// }
// }
// System.out.println();

// }

// public static void main(String args[]) {
// primesInRange(20); // 2 to 20
// }
// }

// ======================================================================================================

// BINARY TO DECIMAL

// public class Functions {

// public static void binToDec(int binNum) {
// int myNum = binNum;
// int pow = 0;
// int dec = 0;
// while (binNum > 0) {
// int lastDigit = binNum % 10;
// dec = dec + (lastDigit * (int) Math.pow(2, pow)); //typecast Math.pow into
// integer

// pow++;
// binNum = binNum / 10;
// }

// System.out.println("Decial of " + myNum + " = " + dec);
// }

// public static void main(String args[]) {
// binToDec(111);
// }
// }

// ======================================================================================================

// DECIMAL TO BINARY

// public class Functions {

// public static void decToBin(int n) {
// int myNum = n;
// int pow = 0;
// int binNum = 0;

// while (n > 0) {
// int rem = n % 2;
// binNum = binNum + (rem * (int) Math.pow(10, pow));

// pow++;
// n = n / 2;
// }

// System.out.println("Binary of " + myNum + " = " + binNum);
// }

// public static void main(String args[]) {
// decToBin(7);
// }
// }

// ======================================================================================================

// SCOPE
// Scope refers to the region of the code where variables are accessible

// LOCAL SCOPE
// Variables declared directly inside a method are available anywhere
// in the method following the line of code in which they were declared

// BLOCK SCOPE
// A block of code refers to all of the code between curly braces ({})
// Variables declared inside blocks of code are only accessible by the code
// between the curly braces

// CLASS SCOPE - oops
// Variables declared outside of any method or block are class variables
// Class variables are accessible by all methods in the class
// ACCESS MODIFIERS - public, private, protected