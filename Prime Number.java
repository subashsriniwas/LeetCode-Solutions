import java.util.*;

public class Prime_Number {
    public static void main (String a[]) {
        System.out.println("Enter the Number to check prime or not?");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        prime(num);
        sc.close();
    }
    
    public static void prime(int num) {
        int count = 0;
        if (num > 1) {
            for (int i=1; i<=num; i++) {
                if (num%i == 0) { count++; }
            }
            if (count == 2) { System.out.println("It is a prime number.."); }
            else { System.out.println("It is not a prime number..");}
        }
        else {
            System.out.println(num + "is not a prime");
        }
    }
}