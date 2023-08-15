import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static void quickSort(int[] arr, int left, int right){
        //파티션 나누고 오른쪽 값 첫번째 값을 받아옴
        int part2 = partition(arr, left, right);

        //왼쪽 파티션의 요소가 하나 이상
        if (left < part2 - 1)
            quickSort(arr, left, part2 - 1);
        //오른쪽 파티션의 요소가 하나 이상
        if (part2 < right)
            quickSort(arr, part2, right);
    }

    private static int partition(int[] arr, int left, int right){
        int pivot = arr[(left + right)/2];
        while (left <= right) {
            while (arr[left] < pivot) left ++;
            while (arr[right] > pivot) right--;
            if (left <= right) {
                swap (arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] A = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++)
            A[i] = Integer.parseInt(st.nextToken());

        quickSort(A, 0, A.length - 1);

        System.out.println(A[K-1]);
    }
}