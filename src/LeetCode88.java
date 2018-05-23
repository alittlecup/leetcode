import java.util.Arrays;

/**
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 *
 * 说明:
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 *
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * 输出: [1,2,2,3,5,6]
 * 思路 遍历num1集合，如果比num2中的数大 则将num2中的数放置到对应的问题，然后将num1中的数据向后移动一个位置
 *
 * 官方思路，倒着进行对比，如果num1中的末尾比num2中的末尾大，则在num1中最后的位置放置num1的数据，否者放置num2中的数据
 */
class LeetCode88 {
  public static void main(String[] args) {
    int[] num1 = new int[] { -1, 3, 0, 0, 0, 0, 0 };//-1,0,0,2,3,0,0,0
    int[] num2 = new int[] { 0, 0, 1, 2, 3 };     //1,2,2
    merge2(num1, 2, num2, 5);
    System.out.println(Arrays.toString(num1));
  }

  public static void merge2(int[] nums1, int m, int[] nums2, int n) {
    int mLast = m - 1;
    int nLast = n - 1;
    int kLast = n + m - 1;
    while (mLast >= 0 && nLast >= 0) {
      if (nums1[mLast] > nums2[nLast]) {
        nums1[kLast--] = nums1[mLast--];
      } else {
        nums1[kLast--] = nums2[nLast--];
      }
    }
    while (mLast >= 0) {
      nums1[kLast--] = nums1[mLast--];
    }
    while (nLast >= 0) {
      nums1[kLast--] = nums2[nLast--];
    }
  }

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    if (n == 0) {
      return;
    }
    int j = 0;
    for (int i = 0; i < nums1.length; i++) {
      if (nums1[i] > nums2[j]) {
        nextNum(i, nums1);
        nums1[i] = nums2[j];
        j++;
      }
      if (nums1[i] == 0 && i >= m + j) {
        nums1[i] = nums2[j];
        j++;
      }

      System.out.println(i + "  -->  " + Arrays.toString(nums1));
      if (j >= n) {
        break;
      }
    }
  }

  public static void nextNum(int index, int[] num) {
    int lastIndex = num.length - 1;
    while (lastIndex > index) {
      num[lastIndex] = num[lastIndex - 1];
      lastIndex--;
    }
  }
}
