/*
 * 将两个升序数组合并
 */

/*解法一:Java 版本 常规的通过指针实现双队列的判断 创建第三个队列存储结果*/

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode head = new ListNode(); //创建头节点
        ListNode p = head;

        //创建两个指向队列的头指针
        ListNode l1 = list1;
        ListNode l2 = list2;

        while(l1 != null && l2 != null)
        {
            if(l1.val <= l2.val)
            {
                p.next = new ListNode(l1.val);
                l1 = l1.next;
            }else{
                p.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            p = p.next;
        }
        if(l1 != null) p.next = l1;
        if(l2 != null) p.next = l2;
        return  head.next;
    }
}