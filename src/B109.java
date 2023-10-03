import java.util.*;

public class B109 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        int W = sc.nextInt();
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int[] p = new int[N];
        int[] q = new int[N];

        int[][] seat = new int[H][W];
        for (int i = 0; i < N; i++) {
            p[i] = sc.nextInt();
            q[i] = sc.nextInt();
            seat[p[i]][q[i]] = 100;
        }

        int manhattan = 100;
        int min = 50;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (seat[i][j] == 0) {
                    manhattan = Math.abs(P - i) + Math.abs(Q - j);
                    if (manhattan <= min) {
                        min = manhattan;
                        seat[i][j] = manhattan;
                    }
                }
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (seat[i][j] == min) {
                    System.out.println("(" + i + " " + j + ")");
                }
            }
        }
        for (int i = 0; i < H; i++) {
        System.out.println(Arrays.toString(seat[i]));
        }
    }
}