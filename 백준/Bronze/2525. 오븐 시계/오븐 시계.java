import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int Y = in.nextInt();
        int Z = in.nextInt();

        in.close();

        int min = 60*X + Y;
        min += Z;

        int hour = (min / 60) % 24;
        int minute= min % 60;

        System.out.println(hour + " " + minute);
    }
}