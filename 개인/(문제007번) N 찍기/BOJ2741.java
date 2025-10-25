// Scanner : 입력을 도와주는 도구(클래스)
import java.util.Scanner;

public class PrintN {
    public static void main(String[] args) {

        // 1. Scanner 만들기 (입력을 받을 준비)
        Scanner sc = new Scanner(System.in);

        // 2. 정수 N 입력받기
        int N = sc.nextInt();

        // 3. 1부터 N까지 반복하면서 출력
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }

        // 4. Scanner 닫기
        sc.close();
    }
}
