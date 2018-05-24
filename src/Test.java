import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;

class Test {
  public static void main(String[] args) {
    ListNode node = new ListNode(1);
    node.next = new ListNode(2);
    node.next.next = new ListNode(3);
    printListNode(node);
    ListNode reverse = printListFromTailToHead(node);
    printListNode(reverse.next);
    DecimalFormat format = new DecimalFormat("#.00");
    String format1 = format.format(15.035);
    System.out.println(Float.valueOf(format1));
  }

  public static ListNode printListFromTailToHead(ListNode listNode) {
    // 头插法构建逆序链表
    ListNode head = new ListNode(-1);
    while (listNode != null) {
      ListNode temp = listNode.next;
      listNode.next = head.next;
      head.next = listNode;
      listNode = temp;
    }

    // 构建 ArrayList
    //ArrayList<Integer> ret = new ArrayList<>();
    //head = head.next;
    //while (head != null) {
    //  ret.add(head.val);
    //  head = head.next;
    //}
    return head;
  }

  public static void printListNode(ListNode node) {
    StringBuilder stringBuilder = new StringBuilder();
    while (node != null) {
      stringBuilder.append(node.val).append(" -- ");
      node = node.next;
    }
    System.out.println(stringBuilder.toString());
  }

  static class ListNode {
    int val;

    ListNode(int val) {
      this.val = val;
    }

    public ListNode next;
  }
};


