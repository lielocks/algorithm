import java.util.*;

class Solution {
    public String solution(int[] numbers) {
            String[] temp = new String[numbers.length];
            
            for (int i = 0; i < temp.length; i++) {
                temp[i] = String.valueOf(numbers[i]);
            }
            
            Arrays.sort(temp, ((o1, o2) -> (o2+o1).compareTo(o1+o2)));
            
            if (temp[0].equals("0")) {
                return "0";
            }
            
            StringBuilder sb = new StringBuilder();

            for (String s : temp) {
                sb.append(s);
            }
            
            return sb.toString();
        }
    }
    //1. 가장 첫번째 자릿수가 큰 것을 비교해서 맨 앞자리에 둔다 
        //2. 두번째로 큰 수를 두번째 자리에 둔다 
        //2-1. 만약 두번째 자리끼리 비교했는데 수가 같다면 그 다음 숫자 비교
        //-> 애초에 이렇게 할 필요가 없음 String 으로 비교하면 값 자체를 비교해주니까
