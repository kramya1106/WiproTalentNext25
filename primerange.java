import java.util.*;
public class primerange {
    public static void main(String[] args) {
        int lo, up, i, j;
        String prime = " ";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range:");
        lo = sc.nextInt();
        up = sc.nextInt();
        for (i = lo; i <= up; i++) {
            int count = 0;
            for (j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count <= 1) {
                prime = prime + i + " ";

            }
        }
        System.out.println("primenumbers:" + prime);
    }

}
