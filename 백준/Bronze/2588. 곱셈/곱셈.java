import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        in.close();
        
            System.out.println(((b % 100) % 10) * a);
            System.out.println(((b % 100) / 10) * a);
            System.out.println((b / 100) * a);
            System.out.println(a * b);
    }
}