package org.nielsen.mergeTwoSortedLists;

import java.util.List;

public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }

      public static ListNode fromList (List<Integer> list) {
            if (!list.isEmpty()) {
                  var head = new ListNode(list.get(0));
                  var prev = head;

                  for (int i = 1; i < list.size(); i ++) {
                        prev.next = new ListNode(list.get(i));
                        prev = prev.next;
                  }
                  return head;
            }
            return new ListNode();
      }

      public int size() {
            int size = 1;
            var currentNode = this;
            while (currentNode.next != null) {
                  size ++;
                  currentNode = currentNode.next;
            }
            return size;
      }

      public int get(int index) {
            int currentIndex = 0;
            ListNode node = this;
            while (currentIndex < index && node.next != null) {
                  currentIndex ++;
                  node = node.next;
            }
            return node.val;
      }
}