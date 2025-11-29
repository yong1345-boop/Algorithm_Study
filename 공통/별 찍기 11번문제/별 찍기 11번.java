import java.util.Scanner;

public class Star11 {
    static char[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N = 3 * 2^k

        int width = 2 * N - 1;       // 출력 너비
        arr = new char[N][width];

        // 배열을 공백으로 초기화
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < width; j++) {
                arr[i][j] = ' ';
            }
        }

        // 재귀적으로 별 찍기: 맨 위 좌표 (0, center)
        draw(0, N - 1, N);

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i]);
            sb.append('\n');
        }
        System.out.print(sb.toString());

        sc.close();
    }

    /**
     * r: 현재 삼각형의 맨 위 행(0-index)
     * c: 현재 삼각형의 중앙 열(0-index)
     * size: 현재 삼각형의 높이 (3, 6, 12, ...)
     */
    static void draw(int r, int c, int size) {
        // 종료 조건: size == 3 이면 고정 패턴 그리기
        if (size == 3) {
            // row r
            arr[r][c] = '*';
            // row r+1
            arr[r + 1][c - 1] = '*';
            arr[r + 1][c + 1] = '*';
            // row r+2 (가운데에 5개)
            for (int i = -2; i <= 2; i++) {
                arr[r + 2][c + i] = '*';
            }
            return;
        }

        int half = size / 2;

        // 위쪽 작은 삼각형 (맨 위)
        draw(r, c, half);

        // 아래 왼쪽 작은 삼각형
        draw(r + half, c - half, half);

        // 아래 오른쪽 작은 삼각형
        draw(r + half, c + half, half);
    }
}
