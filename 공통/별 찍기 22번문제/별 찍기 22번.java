import java.util.Scanner;

public class Star22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // N이 1인 경우 별 하나만 출력하고 종료
        if (n == 1) {
            System.out.println("*");
            return;
        }

        int width = 4 * n - 3;
        int height = 4 * n - 1;
        char[][] map = new char[height][width];

        // 배열 전체를 공백으로 초기화
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                map[i][j] = ' ';
            }
        }

        // 시작 좌표: 오른쪽 위 끝
        int r = 0, c = width - 1;
        
        // 이동 방향: 좌(0), 하(1), 우(2), 상(3)
        int[] dr = {0, 1, 0, -1};
        int[] dc = {-1, 0, 1, 0};
        int dir = 0;

        while (true) {
            map[r][c] = '*';

            // 다음 이동할 칸 계산
            int nr = r + dr[dir];
            int nc = c + dc[dir];

            // 범위를 벗어나거나 이동 방향에 이미 별이 있다면(혹은 바로 옆에 별이 있다면) 방향 전환
            // 소용돌이가 엉키지 않게 하기 위해 두 칸 앞을 체크하는 것이 핵심입니다.
            if (nr < 0 || nr >= height || nc < 0 || nc >= width) {
                dir = (dir + 1) % 4;
                nr = r + dr[dir];
                nc = c + dc[dir];
            } else {
                // 상하좌우 방향에 따라 이미 별이 찍혔는지 확인하여 꺾음
                int nnr = nr + dr[dir];
                int nnc = nc + dc[dir];
                if (nnr >= 0 && nnr < height && nnc >= 0 && nnc < width && map[nnr][nnc] == '*') {
                    dir = (dir + 1) % 4;
                    nr = r + dr[dir];
                    nc = c + dc[dir];
                    
                    // 방향을 꺾었는데도 갈 곳이 이미 별이라면 (소용돌이 끝)
                    if (map[nr][nc] == '*') break;
                }
            }

            // 한 칸 전진
            r = nr;
            c = nc;
            
            // 소용돌이의 정중앙에 도착했을 때 종료 조건 (N에 따른 중앙 좌표)
            if (r == 2 * n && c == 2 * n - 2) {
                map[r][c] = '*';
                break;
            }
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < height; i++) {
            if (i == 1) {
                // 2행은 예제와 같이 첫 별만 출력 (중요 디테일)
                sb.append("*\n");
                continue;
            }
            for (int j = 0; j < width; j++) {
                sb.append(map[i][j]);
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
