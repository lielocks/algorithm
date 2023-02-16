import java.util.*;

class Solution {
    public int solution(int N, int number) {
        int answer = -1;
        int now = N;
        //여기서 우선순위를 정해보자 곱하기, 나누기 -> 잔잔바리 더하기, 빼기
        Set<Integer>[] setArr = new HashSet[9]; //8보다 크면 -1 return
        
        //우선순위 정할 필요가 없음 for문 돌려서 그냥 경우의 수 HashSet에 넣어버리면 됨
        for(int i = 1; i < 9; i++) { //ex. N = 5 -> {5, 55, 555, ... , 55555555}
            setArr[i] = new HashSet<>(); //setArr[0]={{[0]->요기 hashSet 리스트로 들어감, 원소 하나가 아니라}, ..., {}}
            setArr[i].add(now);
            now = now * 10 + N; //N은 for문이 돌아도 값이 변하면 안돼서
        }
        
        for(int i = 0; i < 9; i++) { //1 ~ 8까지 개수를 가지고 있는 통
            for(int j = 1; j < i; j++) {
                for(Integer a : setArr[j]) {
                    for(Integer b : setArr[i-j]) { // ex. a, b -> (0, 0) (0, 1) (0, 2) / (1,0) (1,1) (1, 2) / (2,0) (2,1) (2,2)
                        setArr[i].add(a * b);
                        setArr[i].add(a - b);
                        setArr[i].add(b - a);
                        setArr[i].add(a + b);
                        if(a!=0) {
                            setArr[i].add(b/a);
                        } if(b!=0) {
                            setArr[i].add(a/b);
                        }
                    }
                }
            }
        }
        
        for(int i = 1; i < 9; i++) {
            if(setArr[i].contains(number)) {
                answer = i;
                break;
            }
        }
        return answer;
    }
    
}
