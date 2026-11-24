import java.util.Scanner;

public class Gamee {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int secret = (int)(Math.random() * 100) + 1;
        int counter = 0;
        while(true){
            int num = in.nextInt();
            counter++;
            if( num == secret){
                System.out.println("Correct");
                break;
            }
            else if( num < secret){
                System.out.println("Too low");
            }
            else{
                System.out.println("Too high");
            }

        }

        System.out.println("you found in " + counter + " tries.");


    }

}
