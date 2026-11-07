import java.util.Scanner;

public class 구간_합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long M = sc.nextInt();
        // 데이터 개수 받기 N, 질의 개수 받기 M
        int[] A = new int[N+1];
        long[] S = new long[N+1];
        S[0] = 0;
        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
            S[i] = S[i - 1] + A[i];
        }

        int i = sc.nextInt();
        int j = sc.nextInt();
        // 대상 배열 받기 A(N)

        System.out.println(S[j] - S[i - 1]);
        //출력 : S(j) - S(i - 1)

    }
}
