import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "Aibek";
        StringBuilder student = new StringBuilder("Aibek");

        String substr = name.substring(2,5);
        System.out.println(substr);

        student.delete(0,1);
        System.out.println(student);






    }
}