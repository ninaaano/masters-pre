package plusMission2_1;// @ author ninaaano

import java.util.Iterator;
import java.util.LinkedList;

// 깊이 우선 탐색
public class dfs {
    class Graph {
        private int V; // 노드 개수
        private LinkedList<Integer> abjList[]; // 인접리스트

        Graph(int v) { // 생성자
            V = v;
            abjList = new LinkedList[v]; // 노드의 갯수를 넣는다
            for (int i = 0; i < v; ++i) {
                abjList[i] = new LinkedList();
            }
        }

        // 노드 연결 v -> w
        void addEdge(int v, int w) {
            abjList[v].add(w); // add() 이 목록의 지정된 위치에 지정된 요소 삽입
        }

        // DFS에 의해 사용
        void DFSUtil(int v, boolean visited[]) {
            // 현재 노드를 방문한 것으로 표시하고 값을 출력
            visited[v] = true;
            System.out.println(v + " ");
            // 방문한 노드와 인접한 모든 노드를 가져온다
            Iterator<Integer> i = abjList[v].listIterator(); // 목록의 지정된 위치에서 시작하여 이 목록에 있는 요소릐 목록 반복자를 적절한 순서로 반환한다
            while (i.hasNext()) { // true 순 방향으로 목록을 순회할 때 이 반복문에 더 많은 요소가 있다면 반환한다
                int n = i.next();
                // 방문하지 않은 노드면 해당 노드를 시작 노드로 다시 DFSUtil 호출
                if (!visited[n]) {
                    DFSUtil(n, visited); // 순환호출
                }
            }
        }

        // 주어진 노드를 시작 노드로 DFS 탐색
        void DFS(int v) {
            // 노드의 방문 여부 판단. 초깃값 false
            boolean visited[] = new boolean[v];
            // v를 시작노드로 DFSUtil 순환 호출
            DFSUtil(v, visited);
        }
    }
}
