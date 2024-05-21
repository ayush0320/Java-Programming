import java.util.*;

// NUMBERS FROM 1 TO 10

// public class Loops {
//     public static void main(String args[]) {
//         int counter = 1;
//         while (counter <= 10) {
//             System.out.print(counter + " ");
//             counter++;
//         }
//     }
// }

// =====================================================================================================

// NUMBERS SFROM 1 TO N

// public class Loops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int range = sc.nextInt();
//         int counter = 1;
//         while (counter <= range) {
//             System.out.print(counter + " ");
//             counter++;
//         }
//         System.out.println();
//     }
// }

// =====================================================================================================

// SUM OF FIRST N NATURAL NUMBERS

// public class Loops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int n = sc.nextInt();
//         int sum = 0;

//         int i = 1; // counter or iterator
//         while (i <= n) {
//             sum += i;
//             i++;
//         }

//         System.out.println("Sum is: " + sum);
//     }
// }

// =====================================================================================================

// FOR LOOP

// public class Loops {
//     public static void main(String args[]) {
//         // int i = 1;
//         for (int i = 1; i <= 10; i++) {
//             System.out.println("Hello World!");
//         }
//     }
// }

// =====================================================================================================

// SQUARE PATTERN

// public class Loops {
//     public static void main(String args[]) {
//         for (int line = 1; line <= 4; line++) {
//             System.out.println("****");
//         }
//     }
// }

// =====================================================================================================

// REVERSE OF A NUMBER
// Last digit = n % 10
// Remove last digit = n / 10

// public class Loops {
//     public static void main(String args[]) {
//         int n = 10899;

//         while (n > 0) {
//             int lastDigit = n % 10;
//             System.out.print(lastDigit);
//             n /= 10; // n = n / 10
//         }
//         System.out.println();
//     }
// }

// =====================================================================================================

// REVERSE THE GIVE NNUMBER
// reverse = (reverse * 10) + lastDigit

// public class Loops {
//     public static void main(String args[]) {
//         int n = 10899;
//         int rev = 0;

//         while (n > 0) {
//             int lastDigit = n % 10;
//             rev = (rev * 10) + lastDigit;
//             n /= 10;
//         }
//         System.out.println(rev);

//     }
// }

// =====================================================================================================

// DO WHILE LOOP

// public class Loops {
//     public static void main(String args[]) {
//         int counter = 1;
//         do {
//             System.out.println("Hello World!");
//             counter++;
//         } while (counter <= 10);
//     }
// }

// =====================================================================================================

// BREAK AND CONTINUE

// public class Loops {
//     public static void main(String args[]) {
//         for (int i = 1; i <= 5; i++) {
//             if (i == 3) {
//                 break;
//             }
//             System.out.println(i);
//         }
//         System.out.println("I am out");
//     }
// }

// =====================================================================================================

// KEEP ENTERING NUMBERS TILL USER ENTERS A MULTIPLE OF 10

// public class Loops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         do {
//             System.out.print("Enter a number: ");
//             int n = sc.nextInt();
//             if (n % 10 == 0) {
//                 System.out.println("Can't enter multiple of 10!");
//                 break;
//             }
//             System.out.println(n);
//         } while (true);
//     }
// }

// =====================================================================================================

// CONTINUE
// TO skip an iteration

// public class Loops {
//     public static void main(String args[]) {
//         for (int i = 0; i <= 5; i++) {
//             if (i == 3) {
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }

// =====================================================================================================

// DISPLAY ALL NUMBERS EXCEPT MULTIPLE OF 10

// public class Loops {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         do {
//             System.out.print("Enter a number: ");
//             int num = sc.nextInt();

//             if (num % 10 == 0) {
//                 continue;
//             }
//             System.out.println(num);
//         } while (true);
//     }
// }

// =====================================================================================================

// CHECK IF A NUMBER IS PRIME OR NOT

public class Loops {
    public static void main(String args[]) {
        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}