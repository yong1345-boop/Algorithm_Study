// Scanner : 입력을 도와주는 도구(클래스)
import java.util.Scanner;

public class Star6 {
    public static void main(String[] args) {

        // 1. Scanner 만들기 (입력을 받을 준비)
        Scanner sc = new Scanner(System.in);

        // 2. 줄 수 입력받기
        int N = sc.nextInt();

        // 3. 줄 수만큼 반복
        for (int i = 1; i <= N; i++) {

            // (1) 왼쪽 공백 출력
            // 첫 줄엔 0칸, 두 번째 줄엔 1칸, 세 번째 줄엔 2칸...
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // (2) 별 출력
            // 첫 줄엔 2*N-1개, 둘째 줄엔 2*(N-1)-1개, 즉 2*(N-i+1)-1개
            for (int j = 1; j <= (2 * (N - i + 1) - 1); j++) {
                System.out.print("*");
            }

            // (3) 줄바꿈
            System.out.println();
        }

        // 4. Scanner 닫기
        sc.close();
    }
}
