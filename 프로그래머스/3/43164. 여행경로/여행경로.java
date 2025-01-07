import java.util.*;

class Solution {
    public String[] solution(String[][] tickets) {
        // 그래프 초기화
        Map<String, PriorityQueue<String>> graph = new HashMap<>();
        for (String[] ticket : tickets) {
            graph.putIfAbsent(ticket[0], new PriorityQueue<>());
            graph.get(ticket[0]).offer(ticket[1]);
        }

        // 결과 경로를 저장할 리스트
        List<String> path = new LinkedList<>();

        // DFS로 경로 탐색
        dfs("ICN", graph, path);

        // 리스트를 배열로 변환하여 반환
        return path.toArray(new String[0]);
    }

    private void dfs(String airport, Map<String, PriorityQueue<String>> graph, List<String> path) {
        // 현재 공항에서 갈 수 있는 모든 도착지를 탐색
        PriorityQueue<String> destinations = graph.get(airport);

        while (destinations != null && !destinations.isEmpty()) {
            // 알파벳 순서로 가장 먼저 갈 수 있는 도착지 선택
            String next = destinations.poll();
            dfs(next, graph, path);
        }

        // 경로를 뒤에서부터 추가 (역순으로 탐색 결과 저장)
        path.add(0, airport);
    }
}
