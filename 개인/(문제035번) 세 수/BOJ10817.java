import java.util.Scanner;
import java.util.Arrays;

public class b035threenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 오름차순 정렬
        Arrays.sort(arr);
        
        // 두 번째로 큰 수(인덱스 1) 출력
        System.out.println(arr[1]);
    }
}
