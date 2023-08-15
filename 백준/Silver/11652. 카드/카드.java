import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<Long, Integer> cards = new HashMap<>();

        int max = 0;
        long l = 0;

        for (int i = 0; i < n; i++) {
            long input = Long.parseLong(br.readLine());
            cards.put(input, cards.getOrDefault(input, 0) + 1);

            if (cards.get(input) > max) {
                max = cards.get(input);
                l = input;
            } else if (cards.get(input) == max) {
                l = Math.min(l, input);
            }
        }

        System.out.println(l);
    }
}