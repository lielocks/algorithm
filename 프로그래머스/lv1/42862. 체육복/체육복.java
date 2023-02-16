import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int count = 0;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i = 0; i < lost.length; i++) { 
            //이중 for문 i =0 일떄 j = 0, j=1,j=2까지 갔다가 다시 i=1로 처음부터 도는 것
            for(int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]) { // 여분의 체육복이 있지만 동시에 체육복을 도단당한 학생의 경우 다른 학생에게 체육복을 빌려줄 수 없는 상태로 만든다!! 
                //lost[0] == reserve[0], lost[0] == reserve[1], lost[0] == reserve[2]
                    lost[i] = -11; // 상태값은 아무거나 넣어도 상관 ㄴ
                                    // for문 돌때만 같은 값으로 인식안하게 하면 되니까
                    reserve[j] = -11;
                    count++; //이때도 count는 해줘야지 있었는데 없어진 거니까 lost는 아님 
                             //근데 다른 애한테는 못빌려줌
                    break;
                }
            }
        }
        
        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j] + 1 || lost[i] == reserve[j] - 1) {
                    count++;
                    reserve[j] = -11;
                    break;
                }
            }
        }
        
        return n - lost.length + count;
    }
}