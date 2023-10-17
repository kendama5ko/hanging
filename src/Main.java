import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    String key1 = "dreamer";
    String key2 = "eraser";
    String key3 = "dream";
    String key4 = "erase";
    sc.close();

    while (!S.isEmpty())
      if (S.endsWith(key1)) {
        S = S.substring(0, S.length() - key1.length());
      } else if (S.endsWith(key2)) {
        S = S.substring(0, S.length() - key2.length());
      } else if (S.endsWith(key3)) {
        S = S.substring(0, S.length() - key3.length());
      } else if (S.endsWith(key4)) {
        S = S.substring(0, S.length() - key4.length());
      } else {
        break;
      }
    if (S.length() != 0) {
      System.out.println("NO");
    } else {
      System.out.println("YES");
    }
  }
}
