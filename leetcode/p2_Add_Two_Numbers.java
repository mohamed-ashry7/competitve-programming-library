package leetcode;

public class p2_Add_Two_Numbers {

	/*
	 * Definition for singly-linked list.
	 * 
	 */

	static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		int ires = 0;
		ListNode res = new ListNode();
		ListNode head = res;
		ires += l1.val + l2.val;
		res.val = ires % 10;
		ires /= 10;
		l1 = l1.next;
		l2 = l2.next;
		while (l1 != null || l2 != null) {
			res.next = new ListNode();
			res = res.next;
			if (l1 == null) {
				ires += l2.val;
				l2 = l2.next;
			} else if (l2 == null) {
				ires += l1.val;
				l1 = l1.next;
			} else {
				ires += l1.val + l2.val;
				l1 = l1.next;
				l2 = l2.next;
			}
			res.val = ires % 10;
			ires /= 10;
		}
		if (ires != 0) {
			res.next = new ListNode(ires);
		}
		return head;
	}

	public static void populate(ListNode n, int[] a) {
		ListNode cur = n;
		cur.val = a[0];
		for (int i = 1; i < a.length; i++) {
			cur.next = new ListNode();
			cur = cur.next;
			cur.val = a[i];
		}
	}

	public static void print(ListNode n) {
		ListNode cur = n;
		while (cur != null) {
			System.out.print(cur.val + " ");
			cur = cur.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int[] aa = new int[] { 2, 4, 9 };
		int[] bb = new int[] { 5, 6, 4, 9 };

		ListNode a = new ListNode();
		ListNode b = new ListNode();
		populate(a, aa);
		populate(b, bb);
		print(a);
		print(b);
		ListNode r = addTwoNumbers(a, b);
		print(r);
	}

}
