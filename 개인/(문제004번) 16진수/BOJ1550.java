// Scanner : 입력을 도와주는 도구(클래스)
import java.util.Scanner;

public class HexToDec {
    public static void main(String[] args) {

        // 1. Scanner 만들기 (입력을 받을 준비)
        Scanner sc = new Scanner(System.in);

        // 2. 16진수 문자열 입력받기 (문자 그대로 받음)
        String hex = sc.next(); // 예: A, 1F, FF 등

        // 3. 16진수를 10진수로 변환
        // Integer.parseInt(문자열, 진법)
        int decimal = Integer.parseInt(hex, 16);

        // 4. 변환된 10진수 출력
        System.out.println(decimal);

        // 5. Scanner 닫기
        sc.close();
    }
}
