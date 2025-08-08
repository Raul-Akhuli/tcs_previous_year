/*
Input:
3 3
0 1 5
1 2 3
0 2 10
0 2

Output:
Path: 0 -> 1 -> 2, Total Weight: 8

 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Arrays;
import java.util.Collections;

public class ra_25_shortest_path_in_a_DAG {
    static class Edge{
        int to, weight;
        Edge(int to, int weight){
            this.to = to;
            this.weight = weight;
        }
    }
    private static void topologicalSort(int u, boolean[] visited, Stack<Integer>stack, List<List<Edge>>graph){
        visited[u] = true;
        for(Edge edge : graph.get(u)){
            if(!visited[edge.to]){
                topologicalSort(edge.to, visited, stack, graph);
            }
        }
        stack.push(u);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<List<Edge>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < m; i++){
            int from = sc.nextInt();
            int to = sc.nextInt();
            int weight = sc.nextInt();
            graph.get(from).add(new Edge(to, weight));
        }                                                   // up to this initialization complete.

        // find out the shortest path between 2 vertices

        int src = sc.nextInt();
        int des = sc.nextInt();

        boolean[] visited = new boolean[n];
        Stack<Integer> topo = new Stack<>();
        for(int i  = 0; i < n; i++) {
            if (!visited[i]) {
                topologicalSort(i, visited, topo, graph);
            }
        }
            int [] dist = new int[n];
            int[] parent = new int[n];

            Arrays.fill(dist, Integer.MAX_VALUE);
            Arrays.fill(parent, -1);
            dist[src] = 0;

            while(!topo.isEmpty()){
                int u = topo.pop();

                if(dist[u] != Integer.MAX_VALUE){
                    for(Edge edge : graph.get(u)){
                        int v = edge.to;
                        int w = edge.weight;

                        if(dist[u] + w < dist[v]){
                            dist[v] = dist[u] + w;
                            parent[v] = u;
                        }
                    }
                }
            }

            if(dist[des] == Integer.MAX_VALUE){
                System.out.println("no path exist from " + src + " to " + des);
            }
            else{
                List<Integer> path = new ArrayList<>();

                for(int at = des; at != -1; at = parent[at]) {
                    path.add(at);
                }
                Collections.reverse(path);
                System.out.print("Path: ");
                for(int i = 0; i < path.size(); i++){
                    System.out.print(path.get(i));
                    if(i != path.size()-1){
                        System.out.print(" -> ");
                    }
                }
                System.out.print(", Total Weight: " + dist[des]);
            }

        sc.close();
    }
}
