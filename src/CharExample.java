import java.util.Scanner;

public class CharExample {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //char c = in.next().charAt(0);

        String text = in.next();    // immutable
        String textnew = "";
        //System.out.println(text.length());
        // Get each character
        for(int i=0; i<text.length(); i++){
            char c = text.charAt(i);
            textnew = textnew + Character.toUpperCase(c);
        }
        System.out.println(textnew);



    }

}
