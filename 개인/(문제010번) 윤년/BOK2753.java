// Scanner : 입력을 도와주는 도구(클래스)
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        // 1. Scanner 만들기 (입력을 받을 준비)
        Scanner sc = new Scanner(System.in);

        // 2. 연도 입력받기
        int year = sc.nextInt();

        // 3. 윤년 판별 조건식
        // 4의 배수이면서 100의 배수가 아니거나, 400의 배수이면 윤년
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(1); // 윤년이면 1 출력
        } else {
            System.out.println(0); // 아니면 0 출력
        }

        // 4. Scanner 닫기
        sc.close();
    }
}
