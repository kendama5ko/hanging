import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] t = new int[N+1];
    int[] x = new int[N+1];
    int[] y = new int[N+1];
    t[0] = 0;
    x[0] = 0;
    y[0] = 0;
    for (int i = 1; i <= N; i++) {
      t[i] = sc.nextInt();
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
    }
    sc.close();
    var res = false;
    for (int i = 0; i < N; i++) {
      int turn = 0;
      int distance = 0;
      if (i == N) {
        break;
      }
      turn = t[i + 1] - t[i];
      distance = Math.abs((x[i] + y[i]) - (x[i + 1] + y[i + 1]));
      if (turn - distance == 1 || turn % 2 != distance % 2 
          || turn - distance < 0) {
        System.out.println("No");
        res = false;
        break;
      } else {
        res = true;
      }
    }
    if (res)
      System.out.println("Yes");
  }
}
