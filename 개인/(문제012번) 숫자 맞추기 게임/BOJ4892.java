import java.util.Scanner;

public class NumberGuessingGame {  // ← 클래스명 직접 지정
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int caseNum = 1; // Case 번호 (1부터 시작)

        while (true) {
            int n0 = sc.nextInt(); // 친구가 처음 머릿속에 떠올린 숫자

            // 입력이 0이면 테스트 종료
            if (n0 == 0) {
                break;
            }

            // 1단계: n1 = 3 * n0
            int n1 = 3 * n0;

            // n1이 짝수인지 홀수인지 판별
            String state; // "even" 또는 "odd"
            int n2;

            if (n1 % 2 == 0) {
                // n1이 짝수일 때
                state = "even";
                n2 = n1 / 2;            // 짝수 → n2 = n1 / 2
            } else {
                // n1이 홀수일 때
                state = "odd";
                n2 = (n1 + 1) / 2;      // 홀수 → n2 = (n1 + 1) / 2
            }

            // 3단계: n3 = 3 * n2
            int n3 = 3 * n2;

            // 4단계: n4 = n3 / 9 (정수 나눗셈)
            int n4 = n3 / 9;

            // 출력: Case X: even n4   or   Case X: odd n4
            System.out.println("Case " + caseNum + ": " + state + " " + n4);

            caseNum++; // 다음 케이스 번호 증가
        }

        sc.close(); // Scanner 닫기
    }
}
