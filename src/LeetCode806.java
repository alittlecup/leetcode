import java.util.Arrays;

class LeetCode806 {
  public static void main(String[] args) {
    int[] widths = new int[] {
        4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
        10, 10, 10
    };
    String s = "bbbcccdddaaa";
    System.out.println(Arrays.toString(numberOfLines(widths, s)));

  }

  public static int[] numberOfLines(int[] widths, String S) {
    int[] result = new int[] { 1, 0 };
    for (int i = 0; i < S.length(); i++) {
      int i1 = S.charAt(i)-97;
      if ((result[1] + widths[i1]) <= 100) {
        result[1] += widths[i1];
      } else {
        result[0] += 1;
        result[1] = widths[i1];
      }
    }
    return result;
  }
}

