import java.util.*;

// TYPE CONVERSION
// types compatible
// destination size > source size
// byte -> short -> int -> float -> long -> double
// type conversion is automatic
// implicit conversion/ widening conversion

// public class typeConversion {
//     public static void main(String args[]) {

//         // int a = 25;
//         // long b = a;
//         // System.out.println(b);

//         Scanner sc = new Scanner(System.in);
//         float number = sc.nextInt();
//         System.out.println(number);
//     }
// }

// =====================================================================================================

// TYPE CASTING
// narrowing conversion/ explicit conversion

// public class typeConversion {
//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);

//         char ch = 'a';
//         int number = ch;
//         System.out.println(number);

//         // float a = 24.13f;
//         // // int b = a;
//         // int b = (int) a;
//         // System.out.println(b);
//     }
// }

// =====================================================================================================

// TYPE PROMOTION
// Java automatically promotes each byte, short, char to int when evaluating or expression
// If one operand is long, float, double the whole expression is promoted to long, float, double respectively

// public class typeConversion {
//     public static void main(String args[]) {

//         char a = 'a';
//         char b = 'b';
//         System.out.println((int) (a));
//         System.out.println((int) (b));
//         System.out.println(b - a);
//     }
// }

public class typeConversion {
    public static void main(String args[]) {
        int a = 10;
        float b = 20.25f;
        long c = 30;
        double d = 40;
        double ans = a + b + c + d;
        System.out.println(ans);
    }
}
