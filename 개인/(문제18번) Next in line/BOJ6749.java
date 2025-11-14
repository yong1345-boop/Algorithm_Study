import java.util.Scanner;

public class NextInLine {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int Y = sc.nextInt(); // youngest
    int M = sc.nextInt(); // middle

    // oldest = 2*M - Y
    int O = 2 * M - Y;

    System.out.println(O);

    sc.close();
  }
}
