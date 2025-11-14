import java.util.Scanner;

public class ISBN {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 앞의 10자리는 항상 9780921418로 고정
    int[] digits = {9, 7, 8, 0, 9, 2, 1, 4, 1, 8};

    // 마지막 3자리 입력
    digits = new int[]{
            digits[0], digits[1], digits[2], digits[3], digits[4],
            digits[5], digits[6], digits[7], digits[8], digits[9],
            sc.nextInt(), sc.nextInt(), sc.nextInt()
    };

    int sum = 0;

    // 1-3-sum 계산: index 0부터 시작해서 홀짝에 따라 1,3 번갈아 곱함
    for (int i = 0; i < 13; i++) {
      if (i % 2 == 0) {               // 짝수 index → 1 곱함
        sum += digits[i] * 1;
      } else {                        // 홀수 index → 3 곱함
        sum += digits[i] * 3;
      }
    }

    // 결과 출력
    System.out.println(sum);

    sc.close();
  }
}
