import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int caseNum = 1; // Case 번호 (1부터 시작)

        while (true) {
            int n0 = sc.nextInt(); // 0 < n0 < 1,000,000  (마지막에 0 들어오면 종료)

            // 입력의 마지막 줄: 0 하나 → 더 이상 처리할 데이터 없음
            if (n0 == 0) {
                break; // 반복문 종료
            }

            // 1단계: n1 = 3 * n0
            int n1 = 3 * n0;

            // n1의 홀짝을 저장할 문자열 (even / odd)
            String state;
            int n2;

            // 2단계: n1이 짝수인지 홀수인지 판단
            if (n1 % 2 == 0) {
                // n1이 짝수인 경우
                state = "even";

                // 짝수일 때: n2 = n1 / 2
                n2 = n1 / 2;
            } else {
                // n1이 홀수인 경우
                state = "odd";

                // 홀수일 때: n2 = (n1 + 1) / 2
                n2 = (n1 + 1) / 2;
            }

            // 3단계: n3 = 3 * n2
            int n3 = 3 * n2;

            // 4단계: n4 = n3 / 9  (정수 나눗셈, 몫만 사용)
            int n4 = n3 / 9;

            // 출력 형식:
            // Case X: even n4
            // Case X: odd n4
            System.out.println("Case " + caseNum + ": " + state + " " + n4);

            // 다음 케이스 번호로 증가
            caseNum++;
        }

        sc.close(); // Scanner 자원 정리 (습관처럼 넣어두기)
    }
}
