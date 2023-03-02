import java.util.*;

class Solution {
    boolean[] visited;
    ArrayList<String> result;
    
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        result = new ArrayList<>();
        dfs("ICN", "ICN", 0, tickets);
        Collections.sort(result);
        return result.get(0).split(" ");
    }
    
    public void dfs(String now, String nodes, int count, String[][] tickets) {
        if(count == tickets.length) {
            result.add(nodes);
            return;
            }
        
        for(int i = 0; i < tickets.length; i++) {
            if(!visited[i] && tickets[i][0].equals(now)) {
                visited[i] = true;
                dfs(tickets[i][1], nodes + " " + tickets[i][1], count + 1, tickets);
                visited[i] = false;
            }
        }
    }
}