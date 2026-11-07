import java.util.ArrayList;
import java.util.Scanner;

public class 평균_구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int 시험본 과목 수 N을 받는다. N <= 1000
        int N = sc.nextInt();
        int sum = 0;
        int max = 0;
        int[] A = new int[N];
        //2번째 줄: 세준이의 현재 성적
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            sum += A[i];
            if (max < A[i]) max = A[i];
        }

        System.out.println(sum * 100.0 / max / N);


        //새로운 평균 출력 (원점수/최고점 * 100)
        // ( A / M * 100 + B / M * 100 + C / M * 100 ) / N
        // ( A + B + C ) * 100 / M / N
        // sum * 100 / M / N

    }
}
