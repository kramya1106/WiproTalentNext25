import java.util.*;
public class sumdigit {
    public static void main(String[] args) {
        int num, rem, fin = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num:");
        num = sc.nextInt();
        while (num > 0) {
            rem = num % 10;
            fin = rem + fin;
            num = num / 10;
        }
        System.out.println("sum of digits:" + fin);

    }

}
