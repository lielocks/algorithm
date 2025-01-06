import java.util.*;

class Solution {
    
    public int solution(int n, int[][] costs) {
        Arrays.sort(costs, (o1, o2) -> o1[2] - o2[2]);
        
        int[] parent = new int[n];
        for(int i = 0; i < n; i++) {
            parent[i] = i;
        }
        
        int totalCost = 0;
        
        for (int[] cost : costs) {
            int island1 = cost[0];
            int island2 = cost[1];
            int bridgeCost = cost[2];

            if (findParent(parent, island1) != findParent(parent, island2)) {
                union(parent, island1, island2);
                totalCost += bridgeCost;
            }
        }

        return totalCost;    
    }
    
    private int findParent(int[] parent, int node) {
        if(parent[node] != node) { // 현재 노드가 root 노드인지 확인
            parent[node] = findParent(parent, parent[node]);
        }
        return parent[node];
    }
    
    private void union(int[] parent, int node1, int node2) {
        int root1 = findParent(parent, node1);
        int root2 = findParent(parent, node2);
        if (root1 != root2) {
            parent[root2] = root1; 
        }
    }
}