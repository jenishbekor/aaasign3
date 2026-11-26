import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = "Hello";

        StringBuilder sb = new StringBuilder("Good morning");
        sb.insert(4, ',');
        sb.append("!");

        sb.setCharAt(0,'g');
        System.out.println(sb);

        System.out.println( sb.length());
        System.out.println(sb.capacity());








    }
}