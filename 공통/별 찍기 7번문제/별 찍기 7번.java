// Scanner : 입력을 도와주는 도구(클래스)
import java.util.Scanner;

public class Star7 {
  public static void main(String[] args) {

    // 1. Scanner 만들기 (입력을 받을 준비)
    Scanner sc = new Scanner(System.in);

    // 2. 줄 수 입력받기
    int N = sc.nextInt();

    // 3. 위쪽 피라미드 부분 (1 ~ N)
    for (int i = 1; i <= N; i++) {

      // (1) 공백 출력 : N - i 개
      for (int j = 1; j <= N - i; j++) {
        System.out.print(" ");
      }

      // (2) 별 출력 : (2 * i - 1) 개
      for (int j = 1; j <= (2 * i - 1); j++) {
        System.out.print("*");
      }

      // (3) 줄바꿈
      System.out.println();
    }

    // 4. 아래쪽 역피라미드 부분 (N-1 ~ 1)
    for (int i = N - 1; i >= 1; i--) {

      // (1) 공백 출력 : N - i 개
      for (int j = 1; j <= N - i; j++) {
        System.out.print(" ");
      }

      // (2) 별 출력 : (2 * i - 1) 개
      for (int j = 1; j <= (2 * i - 1); j++) {
        System.out.print("*");
      }

      // (3) 줄바꿈
      System.out.println();
    }

    // 5. Scanner 닫기
    sc.close();
  }
}
