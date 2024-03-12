import java.util.Arrays;

// 시간 복잡도 O(N) 공간복잡도 O(N)
public class SpanSolutionUsingStack {

  public static void main(String[] args) {
        SpanSolution span = new SpanSolution();
        System.out.println(Arrays.toString(span.solution(new int[]{100, 60, 70, 65, 80, 85})));
        System.out.println(Arrays.toString(span.solution(new int[]{2, 3, 4, 5, 6, 7})));
    }

    private int[] solution(int[] price) {
        int[] span = new int[price.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        span[0] = 1;

        for (int i = 1; i < price.length; i++) {
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }
            span[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }
        
        return span;
    }
}

// result [1, 1, 2, 1, 4, 5] [1, 2, 3, 4, 5, 6]
