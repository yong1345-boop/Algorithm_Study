// Scanner : 입력을 도와주는 도구(클래스)
import java.util.Scanner;

public class ReversePrintN {
    public static void main(String[] args) {

        // 1. Scanner 만들기 (입력을 받을 준비)
        Scanner sc = new Scanner(System.in);

        // 2. 정수 N 입력받기
        int N = sc.nextInt();

        // 3. N부터 1까지 반복하면서 출력
        for (int i = N; i >= 1; i--) {
            System.out.println(i);
        }

        // 4. Scanner 닫기
        sc.close();
    }
}
