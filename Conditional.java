import java.util.*;

// public class Conditional {
//     public static void main(String args[]) {
//         int age = 22;
//         if (age >= 18) {
//             System.out.println("adult");
//         } else {
//             System.out.println("not adult");
//         }
//     }
// }

//=====================================================================================================

// LARGEST OF 2 NUMBERS

// public class Conditional {
//     public static void main(String args[]) {
//         int A = 1;
//         int B = 5;
//         if (A >= B) {
//             System.out.println("A is greater");
//         } else {
//             System.out.println("B is greater");
//         }
//     }
// }

//=====================================================================================================

// EVEN OR ODD

// public class Conditional {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in); // Create a snanner object
//         int number = sc.nextInt(); // Read user input
//         if (number % 2 == 0) {
//             System.out.println("Even");
//         } else {
//             System.out.println("Odd");
//         }

//     }
// }

//=====================================================================================================

// INCOME TAX CALCULATOR

// public class Conditional {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in); // Create a snanner object
//         int income = sc.nextInt(); // Read user input
//         int tax;
//         if (income < 500000) {
//             tax = 0;
//         } else if (income >= 500000 && income < 1000000) {
//             tax = (int) (income * 0.2);
//         } else {
//             tax = (int) (income * 0.3);
//         }
//         System.out.println("TAx is: " + tax);

//     }
// }

//=====================================================================================================

// LARGEST OF 3 NUMBERS

// public class Conditional {
//     public static void main(String args[]) {
//         int A = 1, B = 0, C = 3;
//         if (A >= B && A >= C) {
//             System.out.println("A is largest");
//         } else if (B >= C) {
//             System.out.println("B is largest");
//         } else {
//             System.out.println("C is largest");
//         }
//     }
// }

// =====================================================================================================

// TERANARY OPERATOR

// public class Conditional {
//     public static void main(String args[]) {
//         int number = 4;

//         String type = (number % 2 == 0) ? "Even" : "Odd";
//         System.out.println(type);
//     }
// }

// =====================================================================================================

// SWITCH STATEMENT

// public class Conditional {
//     public static void main(String args[]) {
//         int number = 2;
//         switch (number) {
//             case 1:
//                 System.out.println("Samosa");
//                 break;
//             case 2:
//                 System.out.println("Maggi");
//                 break;
//             case 3:
//                 System.out.println("Jave");
//                 break;
//             default:
//                 System.out.println(":(");
//         }
//     }
// }

// =====================================================================================================

// CALCULATOR

public class Conditional {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter operator: ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                break;
        }
    }

}