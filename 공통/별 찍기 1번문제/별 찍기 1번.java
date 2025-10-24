import java.util.Scanner; // 입력을 도와주는 도구(클래스)

public class Main {
    public static void main(String[] args) {

        // 1. Scanner 만들기 (입력을 받을 준비)
        Scanner sc = new Scanner(System.in);

        // 2. 정수 N을 입력받기
        int N = sc.nextInt();

        // 3. 줄 수(i)는 1부터 N까지 반복
        for (int i = 1; i <= N; i++) {

            // 4. 별을 i개 출력 (첫 줄은 1개, 다음 줄은 2개 ...)
            for (int j = 0; j < i; j++) {
                System.out.print("*"); // 줄바꿈 없이 별만 출력
            }

            // 5. 한 줄이 끝났으면 줄바꿈
            System.out.println();
        }

        // 6. Scanner 닫기 (마지막에 해주는 게 습관적으로 좋아)
        sc.close();
    }
}
