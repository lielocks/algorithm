import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
                    int answer = 0;
                    PriorityQueue<Integer> pQueue = new PriorityQueue<>();
    // Arrays.sort(scoville); -> sort 할 필요가 없음 priorityQueue는 이미 정렬을 해준다.
                    for (int i = 0; i < scoville.length; i++) {
                        pQueue.add(scoville[i]);
                    }
                    while(pQueue.peek() < K) {
                        if(pQueue.size() == 1) {
                            return -1; 
    // 문제 조건 항상 주의!!
    //모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우에는 -1을 return 합니다.
                        } 
                        pQueue.add(pQueue.poll() + pQueue.poll() * 2);
                            answer++;
                    }
        return answer;
    }
}