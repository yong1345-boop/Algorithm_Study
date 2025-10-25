// Scanner : 입력을 도와주는 도구(클래스)
import java.util.Scanner;

public class SubtractAB {
    public static void main(String[] args) {

        // 1. Scanner 만들기 (입력을 받을 준비)
        Scanner sc = new Scanner(System.in);

        // 2. 정수 A와 B 입력받기
        int A = sc.nextInt(); // 첫 번째 정수
        int B = sc.nextInt(); // 두 번째 정수

        // 3. A - B 계산
        int diff = A - B; // 두 수의 차이 (difference)

        // 4. 결과 출력
        System.out.println(diff);

        // 5. Scanner 닫기
        sc.close();
    }
}
