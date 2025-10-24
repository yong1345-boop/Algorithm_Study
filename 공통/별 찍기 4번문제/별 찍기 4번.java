// Scanner : 입력을 도와주는 도구(클래스)
import java.util.Scanner;

public class Star4 {
    public static void main(String[] args) {

        // 1. Scanner 만들기 (입력을 받을 준비)
        Scanner sc = new Scanner(System.in);

        // 2. 정수 N 입력받기
        int N = sc.nextInt();

        // 3. 줄 번호 i를 1부터 N까지 반복
        for (int i = 1; i <= N; i++) {

            // 4. 공백 출력 : (i - 1)번 반복
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" "); // 공백 출력
            }

            // 5. 별 출력 : (N - i + 1)번 반복
            for (int j = 0; j < N - i + 1; j++) {
                System.out.print("*"); // 별 출력
            }

            // 6. 한 줄이 끝났으면 줄바꿈
            System.out.println();
        }

        // 7. Scanner 닫기
        sc.close();
    }
}
