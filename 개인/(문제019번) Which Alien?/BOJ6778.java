import java.util.Scanner;

public class WhichAlien {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int antenna = sc.nextInt(); // 안테나 개수
    int eyes = sc.nextInt();    // 눈 개수

    // TroyMartian: 안테나 ≥ 3, 눈 ≤ 4
    if (antenna >= 3 && eyes <= 4) {
      System.out.println("TroyMartian");
    }

    // VladSaturnian: 안테나 ≤ 6, 눈 ≥ 2
    if (antenna <= 6 && eyes >= 2) {
      System.out.println("VladSaturnian");
    }

    // GraemeMercurian: 안테나 ≤ 2, 눈 ≤ 3
    if (antenna <= 2 && eyes <= 3) {
      System.out.println("GraemeMercurian");
    }

    sc.close();
  }
}
