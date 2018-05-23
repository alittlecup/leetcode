class Test {
  public static void main(String[] args) {

    System.out.println(reverse(-345));
  }

  private static int reverse(int x) {
    long reverse = 0;
    while (true) {
      reverse = 10 * reverse + (x % 10);
      if (x / 10 == 0) break;
      x = x / 10;
    }
    if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
      reverse = 0;
    }
    return (int) reverse;
  }

};


