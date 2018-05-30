class LeetCode198 {
  /**
   * 动态规划的，将目标问题转换为相关的多个子问题去解决
   * 求n长度的数组num中，不相邻数的最大和是多少？
   * 转化为动态规划的思想可以理解为
   *
   * 求 num[n-1]+num[n-3]与num[n-2]的最大值是多少？
   */
  public static void main(String[] args) {
    int[] nums = new int[] { 2, 7, 9, 3, 1 };
    System.out.println(rob(nums));
  }

  public static int rob(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    if (nums.length == 1) {
      return nums[0];
    }
    if (nums.length == 2) {
      return Math.max(nums[0], nums[1]);
    }
    int[] map = new int[nums.length + 1];
    map[0] = nums[0];
    map[1] = Math.max(nums[0], nums[1]);
    for (int i = 2; i < nums.length; i++) {
      map[i] = Math.max(nums[i] + map[i - 2], map[i - 1]);
    }
    int p = 0;
    for (int i = 0; i < map.length; i++) {
      p = Math.max(p, map[i]);
    }
    return p;
  }

}
