import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class 숫자의_합_구하기 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;

        for (int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - 48;
            // 아스키 코드 연산
            // 1. 문자형의 숫자 - 48 = 숫자
            // 2. 문자형의 숫자 - '0' = 숫자
        }
        System.out.print(sum);
    }
}