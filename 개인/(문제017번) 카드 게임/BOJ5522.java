import java.util.Scanner;

public class CardGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int sum = 0; // 총점 저장 변수

    // 5번 반복하며 점수 입력받아 합산
    for (int i = 0; i < 5; i++) {
      int score = sc.nextInt(); // i번째 점수
      sum += score;             // 합계에 더함
    }

    // 총점 출력
    System.out.println(sum);

    sc.close();
  }
}
