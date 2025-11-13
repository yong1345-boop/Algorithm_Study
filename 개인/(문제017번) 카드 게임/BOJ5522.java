import java.util.Scanner;

public class CardGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int sum = 0; // JOI군의 총점을 저장할 변수

    // 문제에서 5번의 점수가 주어진다고 명시함
    for (int i = 1; i <= 5; i++) {
      int score = sc.nextInt(); // i번째 게임의 점수 (0 ≤ Ai ≤ 100)
      sum += score;             // 점수 누적
    }

    // JOI군의 총점 출력
    System.out.println(sum);

    sc.close();
  }
}
