// Scanner : 입력을 도와주는 도구(클래스)
import java.util.Scanner;

public class CompareLoop {
    public static void main(String[] args) {

        // 1. Scanner 만들기 (입력을 받을 준비)
        Scanner sc = new Scanner(System.in);

        // 2. 무한 반복 (0 0이 나올 때까지)
        while (true) {
            int A = sc.nextInt(); // 첫 번째 수 입력
            int B = sc.nextInt(); // 두 번째 수 입력

            // 3. 종료 조건 : 0 0이면 반복 종료
            if (A == 0 && B == 0) {
                break;
            }

            // 4. 비교 후 결과 출력
            if (A > B) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        // 5. Scanner 닫기
        sc.close();
    }
}
