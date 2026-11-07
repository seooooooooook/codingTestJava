import java.util.Scanner;

public class 투_포인터 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int start_index = 1;
        int end_index = 1;
        int count = 1;
        int sum = 1;

        while (end_index != N){
            if(sum == N){
                count++;
                end_index++;
                sum += end_index;
            }else if (sum > N){
                sum -= start_index;
                start_index++;
            } else if (sum < N) {
                end_index++;
                sum += end_index;
            }
        }

        System.out.println(count);
        //N 크기의 배열 선언, 시작 인덱스 1, 끝 인덱스 1
        //시작 인덱스가 15일때까지
        //count 올리기


    }
}
