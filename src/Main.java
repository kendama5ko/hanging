import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<Integer> a = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      a.add(sc.nextInt());
    }
    sc.close();
    Collections.sort(a);
    Collections.reverse(a);
    int alice = 0;
    int bob = 0;
    int res = 0;
    for (int i = 0; i < N; i++) {
      if ( i % 2 == 1) {
        bob += a.get(i);
      } else {
        alice += a.get(i);
      }
    }
    res = alice - bob;
    
    System.out.println(alice - bob);

    
  }
}