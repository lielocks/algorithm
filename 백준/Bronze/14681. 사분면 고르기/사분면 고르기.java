import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int Y = in.nextInt();

        in.close();

        if (X > 0) {
            if (Y > 0) {
                System.out.println(1);
            } else System.out.println(4);
        } 
        else if (X < 0) {
            if (Y > 0) {
                System.out.println(2);
            } else System.out.println(3);
        }

    }
}