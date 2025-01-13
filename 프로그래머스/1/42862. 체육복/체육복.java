import java.util.*;

class Solution {
    
    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n + 1];
        Arrays.fill(students, 1);
        
        for(int l : lost) {
            students[l]--;
        }
        
        for(int r : reserve) {
            students[r]++;
        }
        
        for(int i = 1; i <= n; i++) {
            if(students[i] == 0) {
                // 앞번호 학생에게 빌릴 수 있는 경우
                if (i > 1 && students[i - 1] == 2) { 
                    students[i]++;
                    students[i - 1]--;
                } 
                // 뒷번호 학생에게 빌릴 수 있는 경우
                else if (i < n && students[i + 1] == 2) { 
                    students[i]++;
                    students[i + 1]--;
                }
            }
        }
        
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(students[i] > 0) {
                count++;
            }
        }
        
        return count;
    }
    
}