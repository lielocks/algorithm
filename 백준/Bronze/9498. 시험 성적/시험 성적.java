import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        in.close();

        String str = (a >= 90) ? "A" : ((a >= 80) ? "B" : (a >= 70) ? "C" : (a >= 60) ? "D" : "F");
        System.out.println(str);
    }

}