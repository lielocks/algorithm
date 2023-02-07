import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        ArrayList<Integer> list = new ArrayList();
        int value = -1;
//        answer= new int[list.size()];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != value) {
                list.add(arr[i]);
                value = arr[i];
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}