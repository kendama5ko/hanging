import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Y = sc.nextInt();
    var res = false;
    int z = 0;
    sc.close();
    label: for (int i = 0; i <= N; i++) {
      if (Y == 10000 * i && i == N) {
        System.out.println(i + " " + 0 + " " + 0);
        res = true;
        break label;
      }
      for (int j = 0; j <= N; j++) {
        if (Y == 10000 * i + 5000 * j && i + j == N) {
          System.out.println(i + " " + j + " " + 0);
          res = true;
          break label;
        } else if ((Y - (10000 * i + 5000 * j)) % 1000 == 0) {
          z = (Y - (10000 * i + 5000 * j)) / 1000;
          if (z + i + j == N && z > 0) {
            System.out.println(i + " " + j + " " + z);
            res = true;
            break label;
          }
        }
      }
    }
    if (!res)
      System.out.println(-1 + " " + -1 + " " + -1);
  }
}