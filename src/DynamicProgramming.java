import java.util.Arrays;

class DynamicProgramming {
  public static void main(String[] args) {
    //System.out.println(fib(7));
    int[] p = new int[] { 1, 5, 8, 9, 10, 17, 17, 20, 24, 30 };
    System.out.println(cut(p, 4));
  }

  private static int fib(int n) {
    int[] map = new int[n + 1];
    for (int i = 0; i < n + 1; i++) {
      map[i] = -1;
    }
    return fibb(n, map);
  }

  private static int fibb(int n, int[] map) {
    if (map[n] != -1) {
      System.out.println("asdf" + Arrays.toString(map));
      return map[n];
    }
    if (n <= 2) {
      map[n] = 1;
    } else {
      map[n] = fibb(n - 1, map) + fibb(n - 2, map);
    }
    System.out.println(Arrays.toString(map));
    return map[n];
  }

  private static int cut(int[] p, int n) {
    if (n == 0) {
      return 0;
    }
    int q = Integer.MIN_VALUE;
    for (int i = 1; i <= n; i++) {
      q = Math.max(q, p[i - 1] + cut(p, n - i));
    }
    return q;
  }

}
