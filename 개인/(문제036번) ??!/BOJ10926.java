import java.util.Scanner;

public class b036qqe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 아이디 입력 받기
        if (sc.hasNext()) {
            String id = sc.next();
            
            // 입력받은 아이디 뒤에 ??!를 붙여서 출력
            System.out.println(id + "??!");
        }
        
        sc.close();
    }
}
