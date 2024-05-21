// NESTED LOOPS
// 1.Lines
//   - Outer loop
// 2.Number of times
//   - Inner loop
// 3.What to print

// =====================================================================================================

// STAR PATTERN

// public class Patterns {
//     public static void main(String args[]) {
//         for (int line = 1; line <= 4; line++) {
//             for (int star = 1; star <= line; star++) {
//                 System.out.print("*");
//             }
//             System.out.println(); // next line
//         }
//     }
// }

// =====================================================================================================

//INVERTED STAR PATTERN
// Stars = n - i + 1

// public class Patterns {
//     public static void main(String args[]) {
//         int n = 4;
//         for (int line = 1; line <= n; line++) {
//             for (int star = 1; star <= n - line + 1; star++) {
//                 System.out.print("*");
//             }
//             System.out.println(); // next line
//         }
//     }
// }

// =====================================================================================================

// HALF PYRAMID PATTERN

// public class Patterns {
//     public static void main(String args[]) {
//         int n = 4;
//         for (int line = 1; line <= n; line++) {
//             for (int numbers = 1; numbers <= line; numbers++) {
//                 System.err.print(numbers);
//             }
//             System.out.println();
//         }
//     }
// }

// =====================================================================================================

// CHARACTER PATTERN

public class Patterns {
    public static void main(String args[]) {
        int n = 4;
        char ch = 'A';

        // outer loop
        for (int line = 1; line <= n; line++) {

            // inner loop
            for (int chars = 1; chars <= line; chars++) {
                System.err.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}