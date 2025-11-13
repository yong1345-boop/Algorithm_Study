import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // 테스트 케이스 개수
        // 테스트 케이스는 1개 이상, 100 미만

        while (t-- > 0) {
            int n = sc.nextInt(); // 현재 테스트 케이스의 n
            // n은 2~12 사이의 자연수

            // 쌍 출력 규칙:
            // 1 < a < b, a + b = n
            // 사전순: a가 작은 것부터 출력

            // 쌍이 있는지 여부 확인
            boolean found = false;

            for (int a = 1; a < n; a++) {
                int b = n - a;    // 두 번째 수는 자동 결정됨

                // 첫 번째가 두 번째보다 반드시 작아야 함
                if (a < b) {
                    System.out.println(a + " " + b);
                    found = true;
                }
            }


            if (!found) {
  // 아무 출력도 하지 않음 → 문제 조건 충족
}


            
            // 쌍을 출력한 후 테스트 케이스 사이에 **빈 줄 한 줄** 넣는 경우가 있음
            // BOJ 문제 설명에서 "출력 형식 참고"라고 했기 때문에,
            // 테스트 케이스마다 한 줄 띄우는 패턴을 맞춰야 한다.
            // 단, 마지막 테스트 케이스 뒤에는 빈 줄 출력하지 않음.
            if (t > 0) {
                System.out.println();
            }
        }

        sc.close();
    }
}
