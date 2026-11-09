import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 주몽의_명령 {
    public static void main(String[] args) throws IOException {
        // 재료의 개수 N 1<= N <= 15000
        // 갑옷을 만드는데 필요한 수 M 1 <= M <= 10,000,000
        // N개의 재료들의 번호
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int[] arr = new int[N];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(arr);

        int count = 0;
        int s_idx = 0;
        int e_idx = N-1;

        while(s_idx < e_idx) {
            int sum = arr[s_idx] + arr[e_idx];
            if (sum == M) {
                count++;
                s_idx++;
                e_idx--;
            }
            if (sum > M) e_idx--;
            if (sum < M) s_idx++;
        }

        System.out.println(count);
    }
}
