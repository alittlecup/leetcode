import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

class LeetCode412 {
  public static void main(String[] args) {
    System.out.println(fizzBuzzAnswer(15));
  }

  private static List<String> fizzBuzz(int n) {
    List<String> strings = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      boolean isThree = i % 3 == 0;
      boolean isFive = i % 5 == 0;
      if (isThree && isFive) {
        strings.add("FizzBuzz");
      } else if (isThree) {
        strings.add("Fizz");
      } else if (isFive) {
        strings.add("Buzz");
      } else {
        strings.add(String.valueOf(i));
      }
    }
    return strings;
  }

  private static List<String> fizzBuzzAnswer(int n) {
    return new AbstractList<String>() {
      private static final String fizz = "Fizz";
      private static final String buzz = "Buzz";
      private static final String fb = "FizzBuzz";

      @Override public String get(int i) {
        i++;
        if (i % 3 == 0) {
          if (i % 5 == 0) {
            return fb;
          } else {
            return fizz;
          }
        } else if (i % 5 == 0) {
          return buzz;
        } else {
          return String.valueOf(i);
        }
      }

      @Override public int size() {
        return n;
      }
    };
  }
}
