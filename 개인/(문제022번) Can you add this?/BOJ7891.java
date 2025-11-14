import java.util.Scanner;

public class AddThis {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt(); // 테스트 케이스 수

    while (t-- > 0) {
      long x = sc.nextLong(); // x는 -10^9 ~ 10^9
      long y = sc.nextLong(); // y도 동일 범위

      long sum = x + y;       // long으로 계산해야 함

      System.out.println(sum); // 결과 출력
    }

    sc.close();
  }
}
