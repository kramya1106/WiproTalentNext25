import java.util.*;

public class palin {
    public static void main(String[] args) {
        int num, rem, fin = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num:");
        num = sc.nextInt();
        int temp = num;
        while (num > 0) {
            rem = num % 10;
            fin = rem + fin * 10;
            num = num / 10;
        }
        System.out.println("revnum:" + fin);
        if (temp == fin) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }

}
