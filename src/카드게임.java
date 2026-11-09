import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class 카드게임 {
    public static void main(String[] args) {
        /**
         * Queue<Integer> q = new ArrayDeque<>();
         *
         * for i=1; i<=N; i++
         *  q.offer(i);
         *
         * while(q.size >= 2){
         *   q.poll();
         *   q.offer(q.poll());
         * }
         */
        Queue<Integer> q = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }

        while (q.size() >= 2) {
            q.poll();
            q.offer(q.poll());
        }

        System.out.println(q.peek());
    }
}
