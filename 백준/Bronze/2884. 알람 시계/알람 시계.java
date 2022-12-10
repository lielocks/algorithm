import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int Y = in.nextInt();

        in.close();

        if (Y < 45) {
            Y = (60 + Y) - 45;
            X--;
            if (X < 0) {
                X = 23;
            }
            System.out.println(X + " " + Y);
        }
        else {
            System.out.println(X + " " + (Y - 45));
        }

    }
}
