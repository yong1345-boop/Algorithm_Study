// Scanner : 입력을 도와주는 도구(클래스)
import java.util.Scanner;
import java.util.Arrays; // 배열 정렬 기능을 쓰기 위해 import

public class SortThreeNumbers {
    public static void main(String[] args) {

        // 1. Scanner 만들기 (입력을 받을 준비)
        Scanner sc = new Scanner(System.in);

        // 2. 정수 3개 입력받기
        int[] nums = new int[3]; // 정수 3개를 담을 배열 만들기
        for (int i = 0; i < 3; i++) {
            nums[i] = sc.nextInt();
        }

        // 3. 배열 정렬하기 (오름차순)
        Arrays.sort(nums);

        // 4. 정렬된 결과 출력하기
        System.out.println(nums[0] + " " + nums[1] + " " + nums[2]);

        // 5. Scanner 닫기
        sc.close();
    }
}
