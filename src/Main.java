import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    sc.close();
    LinkedList<Integer> part = new LinkedList<>();
    int sum = 0;
    int res = 0;
    for (int i = 1; i <= N; i++) {
      int c = i;
      sum = 0;
      while (c != 0) {
        part.push(c % 10);
        c /= 10;
      }
      while (!part.isEmpty()) {
        sum += part.pop();
      }
      if (A <= sum && sum <= B) {
        res += i;
      }
    }
  System.out.println(res);
  }
}