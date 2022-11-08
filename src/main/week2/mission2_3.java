package main.week2;// @ author ninaaano

import java.util.Scanner;
import java.util.Stack;

public class mission2_3 {
    /*
    배열을 활용하여 문제를 해결할 수 있음
    DFS 사용 권장 - 깊이 우선 탐색 알고리즘. 최대한 멀리 있는 노드를 우선으로 탐색하는 방식으로 동작. 스택 자료구조 이용
    path의 좌표를 출력
     */
    public static int[][] myMaze ={
            {0, 0, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 0, 1, 1, 1, 1},
            {1, 1, 1, 0, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 0}
    };
    // 미로의 크기
    public static int mazeSize = myMaze.length;
    // Index를 저장하는 스택
    public static Stack<Index> stack = new Stack<>();
    // 배열 방문 여부
    public static boolean flag = false;

    // DFS로 특정 노드를 방문하고 연결된 모든 노드들도 방문
    public static void dfs(int x,int y){
        Index curr = new Index(x,y); // 현재 위치
        myMaze[0][0]=1;

        while (true) {
            if(x<=-1||x>=mazeSize||y<=-1||y>=mazeSize){
                System.out.println("잘못된 경로 입니다");
                break;
            }
            if (curr.getX() == mazeSize - 1 && curr.getY() == mazeSize - 1) { // 골인지점 설정
                System.out.println("미로탈출 완료!");
                break;
            } else {
                findWay(curr); // 현재 위치를 기준으로 길 탐색
                Index temp = stack.pop();
                System.out.println("" + temp.getX() + " " + temp.getY() + "로 이동");
                curr.setX(temp.getX()); // 현재 위치를 pop으로 변경
                curr.setY(temp.getY());
            }
        }

//        // 현재 노드를 아직 방문하지 않았다면
//        if(myMaze[x][y]==0){
//            // 해당 노드 방문 처리
//            myMaze[x][y] = 1; // push
//            // 상,하,좌,우의 위치들도 모두 재귀적으로 호출
//            dfs(x-1,y); // 상
//            dfs(x,y-1); // 하
//            dfs(x+1,y); // 좌
//            dfs(x,y+1); // 우
//            //return true;
//        }
//        //return false;
    }

    // 현재 위치의 상하좌우 탐색 메서드
    public static void findWay(Index curr) {
        int x = curr.getX();
        int y = curr.getY();

        // 위 탐색
        if (x > 0) {
            if (myMaze[x - 1][y] != 1) { // 벽이 아니면 추가
                stack.push(new Index(x - 1, y));
                myMaze[x - 1][y] = 1; // 추가하고 벽으로 만들어버림
            }
        }

        // 왼쪽 탐색
        if (y > 0) {
            if (myMaze[x][y - 1] != 1) {
                stack.push(new Index(x, y - 1));
                myMaze[x][y - 1] = 1;
            }
        }

        // 오른쪽 탐색
        if (y < mazeSize - 1) {
            if (myMaze[x][y + 1] != 1) {
                stack.push(new Index(x, y + 1));
                myMaze[x][y + 1] = 1;
            }
        }

        // 아래 탐색
        if (x < mazeSize - 1) {
            if (myMaze[x + 1][y] != 1) {
                stack.push(new Index(x + 1, y));
                myMaze[x + 1][y] = 1;
            }
        }
    }


    public static void main(String[] args) {
        // 깊이 우선 탐색 실행
        dfs(0,0);
    }


}

// Stack을 담을 객체. x와 y를 가지고 있다.
class Index{
    private int x;
    private int y;

    public Index() {
    }

    public Index(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

