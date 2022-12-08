import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        in.close();

        StringBuilder sb = new StringBuilder();
        sb.append(a+b);
        sb.append('\n');

        sb.append(a-b);
        sb.append('\n');

        sb.append(a*b);
        sb.append('\n');

        sb.append(a/b);
        sb.append('\n');

        sb.append(a%b);

        System.out.println(sb);
    }
}
