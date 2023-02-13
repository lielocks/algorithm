import java.util.*;
import java.util.stream.Collectors;

class Solution {
        public int solution(int[][] sizes) {
            int answer = 0;
            int max_row = 0;
            int max_col = 0;
            for (int i = 0; i < sizes.length; i++) {
                int r = Math.max(sizes[i][0], sizes[i][1]);
                int c = Math.min(sizes[i][0], sizes[i][1]);
                max_row = Math.max(max_row, r);
                max_col = Math.max(max_col, c);
            }
            return answer = max_col * max_row;
        }
    }