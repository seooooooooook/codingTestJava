import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class 스택으로_수열_만들기 {
    //  static Deque<Integer> stack = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        /***
         * N 수열개수
         * A[] 수열 배열
         * 수열 배열 채우기 O(N)
         *
         * for n
         * {
         *   if 현재 수열 값 >= 오름차순 자연수
         *      while 값이 같아질때까지
         *          push
         *          + 저장
         *      pop
         *      - 저장
         *  else 현재 수열 값 < 오름차순 자연수
         *      pop
         *      if 스택 pop 결과값 > 수열의 값 NO
         *      else - 저장
         */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(bufferedReader.readLine());
        int[] A = new int[N];
        Deque<Integer> stack = new ArrayDeque<>();

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int idx = 1;
        boolean no = false;
        for (int i = 0; i < N; i++) {
            if(A[i] >= idx){
                while(A[i] >= idx){
                    stack.push(idx++);
                    stringBuilder.append("+\n");
                }
                stack.pop();
                stringBuilder.append("-\n");
            }else {
                int curr = stack.pop();
                if (curr > A[i]) {
                    no = true;
                    break;
                }else{
                    stringBuilder.append("-\n");
                }
            }
        }

        if(no){
            System.out.println("NO");
        }else{System.out.println(stringBuilder);};


    }

    // static push(i)

    //   print +

    // static pop(i)
    //   idx++;
    //   print -
}
