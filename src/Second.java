import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Sequence=" + n);
        while (n != 1) {
            n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
            System.out.println(" " + n);
        }
    }
}