import java.util.Scanner;

public class b037CountMeIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 문장의 개수 S 입력
        if (!sc.hasNextInt()) return;
        int s = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < s; i++) {
            String line = sc.nextLine();
            int vowels = 0;
            int consonants = 0;

            for (int j = 0; j < line.length(); j++) {
                char ch = line.charAt(j);

                // 공백은 제외하고 알파벳인 경우만 체크
                if (ch == ' ') continue;

                // 모음인지 확인 (대소문자 모두 포함)
                if (isVowel(ch)) {
                    vowels++;
                } else {
                    // 공백이 아니고 모음이 아니면 자음 (문제 조건상 알파벳만 입력됨)
                    consonants++;
                }
            }
            // 자음 개수, 모음 개수 순으로 출력
            System.out.println(consonants + " " + vowels);
        }
        sc.close();
    }

    // 모음을 판별하는 도우미 메서드
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c); // 대소문자 통합 처리
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
