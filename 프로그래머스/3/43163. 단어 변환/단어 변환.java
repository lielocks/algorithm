import java.util.*;

class Solution {
    
    public int solution(String begin, String target, String[] words) {
        if(!Arrays.asList(words).contains(target)) {
            return 0;
        }
        
        int answer = 0;
        Queue<String> queue = new LinkedList<>();
        queue.offer(begin);
        boolean[] visited = new boolean[words.length];
        
        while(!queue.isEmpty()) {
            
            for(int i = 0; i < queue.size(); i++) {
                String current = queue.poll();
                if(current.equals(target)) {
                    return answer;
                }
                for(int j = 0; j < words.length; j++) {
                    if(!visited[j] && canCovert(current, words[j])) {
                        visited[j] = true;
                        queue.offer(words[j]);
                    }
                }
            }
            answer++;
        }
  
        return 0;
    }
    
    private boolean canCovert(String current, String targetWord) {
        int diffCount = 0;
        for(int i = 0; i < current.length(); i++) {
            if(current.charAt(i) != targetWord.charAt(i)) {
                diffCount++;
            }
        }
        return diffCount == 1;
    }
}