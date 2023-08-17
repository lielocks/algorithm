import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] queue = new int[10001];

    static int first = 0;
    static int last = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        while(N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");

            switch(st.nextToken()) {

                case "push" :
                    push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop" :
                    sb.append(pop()).append("\n");
                    break;

                case "size" :
                    sb.append(size()).append("\n");
                    break;

                case "empty" :
                    sb.append(empty()).append("\n");
                    break;

                case "front" :
                    sb.append(front()).append("\n");
                    break;

                case "back" :
                    sb.append(back()).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }

    public static void push(int X) {
        queue[last] = X;
        last++;
    }

    public static int pop() {
        if (last - first == 0) {
            return -1;
        } else {
            int P = queue[first];
            first++;
            return P;
        }
    }

    public static int size() {
        return last - first;
    }

    public static int empty() {
        if (last - first == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int front() {
        if (last - first == 0) {
            return -1;
        } else {
            int F = queue[first];
            return F;
        }
    }

    public static int back() {
        if (last - first == 0) {
            return -1;
        } else {
            int B = queue[last - 1];
            return B;
        }
    }

}