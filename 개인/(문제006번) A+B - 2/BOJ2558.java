// Scanner : 입력을 도와주는 도구(클래스)
import java.util.Scanner;

public class AddAB2 {
    public static void main(String[] args) {

        // 1. Scanner 만들기 (입력을 받을 준비)
        Scanner sc = new Scanner(System.in);

        // 2. 첫 번째 줄에서 A 입력받기
        int A = sc.nextInt();

        // 3. 두 번째 줄에서 B 입력받기
        int B = sc.nextInt();

        // 4. A + B 계산
        int sum = A + B;

        // 5. 결과 출력
        System.out.println(sum);

        // 6. Scanner 닫기
        sc.close();
    }
}
