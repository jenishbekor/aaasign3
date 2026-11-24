import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int total = 0;
        while (n > 1) {
            n = n / 2;
            total += 1;
        }
        System.out.println("division" + "=" + total + "(" + n + ")");

    }
}