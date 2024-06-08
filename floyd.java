import java.util.*;

public class floyd {
    public static void main(String[] args) {
        int i, j, row;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows:");
        row = sc.nextInt();
        for (i = 0; i < row; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
