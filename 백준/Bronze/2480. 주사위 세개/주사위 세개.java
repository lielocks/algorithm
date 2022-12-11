import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int Y = in.nextInt();
        int Z = in.nextInt();

        in.close();

        if ((X == Y) && (Y == Z) && (X == Z)) {
            System.out.println(10000 + X * 1000);
        } else if (X == Y || X == Z) {
            System.out.println(1000 + X * 100);
        } else if (Y == Z) {
            System.out.println(1000 + Y * 100);
        } else {
            System.out.println(Math.max(X, Math.max(Y, Z)) * 100);
            }
    }
}