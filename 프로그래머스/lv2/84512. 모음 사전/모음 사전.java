class Solution {
    public String str = "AEIOU";
    public int[] arr = {781, 156, 31, 6, 1};
    
    public int solution(String word) {
        int answer = word.length(); //A에서 E넘어가는 거를 word.length()자릿수로 애초에 처리해주는거
        for(int i = 0; i < word.length(); i++) {
            answer += arr[i] * str.indexOf(word.charAt(i));
        }
        return answer;
    }
}