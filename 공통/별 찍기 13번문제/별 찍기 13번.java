import java.util.Scanner;

/**
 * 별 찍기 - 13
 * 입력받은 N 을 기준으로 위쪽 삼각형(1~N), 아래쪽 삼각형(N-1~1)을 출력한다.
 */
public class Star13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력 받기
        int N = sc.nextInt(); // 별 개수 기준이 되는 N 값

        // 위쪽 삼각형 출력 (1 ~ N)
        for (int i = 1; i <= N; i++) { // i가 현재 줄의 별 개수
            for (int j = 1; j <= i; j++) { // i개만큼 별 찍기
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }

        // 아래쪽 삼각형 출력 (N - 1 ~ 1)
        for (int i = N - 1; i >= 1; i--) { // 아래로 내려갈수록 별 개수 줄어듦
            for (int j = 1; j <= i; j++) { // i개만큼 별 찍기
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }

        sc.close(); // Scanner 닫기
    }
}
