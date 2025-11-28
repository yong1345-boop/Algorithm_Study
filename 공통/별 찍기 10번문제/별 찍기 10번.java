import java.util.Scanner;

public class Main {

    static char[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new char[N][N];

        drawStar(0, 0, N, false);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }

    // x, y: 시작 좌표
    // size: 현재 패턴 크기
    // blank: 이 영역이 공백이어야 하는지
    static void drawStar(int x, int y, int size, boolean blank) {

        // 이 영역이 공백이라면 모두 공백으로 채움
        if (blank) {
            for (int i = x; i < x + size; i++) {
                for (int j = y; j < y + size; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        // size == 1 이면 별 하나 출력
        if (size == 1) {
            arr[x][y] = '*';
            return;
        }

        int newSize = size / 3; // 3등분 사이즈
        int cnt = 0;            // 9개 블록 중 몇 번째인지 체크

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cnt++;

                // 가운데 블록이면 blank = true
                if (cnt == 5) {
                    drawStar(x + i * newSize, y + j * newSize, newSize, true);
                } else {
                    drawStar(x + i * newSize, y + j * newSize, newSize, false);
                }
            }
        }
    }
}
