// Scanner : 입력을 도와주는 도구(클래스)
import java.util.Scanner;

public class CompareAB {
    public static void main(String[] args) {

        // 1. Scanner 만들기 (입력을 받을 준비)
        Scanner sc = new Scanner(System.in);

        // 2. 정수 A와 B 입력받기
        int A = sc.nextInt();
        int B = sc.nextInt();

        // 3. 조건문(if문)으로 A와 B 비교하기
        if (A > B) {
            System.out.println(">");   // A가 더 클 때
        } else if (A < B) {
            System.out.println("<");   // B가 더 클 때
        } else {
            System.out.println("==");  // 두 수가 같을 때
        }

        // 4. Scanner 닫기
        sc.close();
    }
}
