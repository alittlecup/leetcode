class Solution {
  public static void main(String[] args) {
    System.out.println(climbStairs(1));
    System.out.println(climbStairs(2));
    System.out.println(climbStairs(3));
    System.out.println(climbStairs(4));
    System.out.println(climbStairs(5));
    System.out.println(climbStairs(6));
  }

  public static int climbStairs(int n) {
    int pre = 1;
    int prePre = 0;
    for (int i = 1; i < n; i++) {
      int cur = pre + prePre;
      prePre = pre;
      pre = cur;


    }
    return pre + prePre;
  }
}
