class Solution {
    public int longestCycle(int[] edges) {
        int n = edges.length;
        boolean vis[] = new boolean[n];
        boolean path[] = new boolean[n];
        int dist[] = new int[n];

        int[] ans = {Integer.MIN_VALUE}; // Pass ans as an array

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                dfs(i, dist, vis, path, edges, 0, ans);
            }
        }
        return ans[0] == Integer.MIN_VALUE ? -1 : ans[0];
    }

    void dfs(int i, int dist[], boolean vis[], boolean path[], int[] edges, int distance, int[] ans) {
        if (i != -1) {
            if (!vis[i]) {
                vis[i] = true;
                path[i] = true;
                dist[i] = distance;

                dfs(edges[i], dist, vis, path, edges, distance + 1, ans);
            } else if (path[i]) {
                ans[0] = Math.max(ans[0], distance - dist[i]); // Update ans
            }
            path[i] = false;
        }
    }
}
