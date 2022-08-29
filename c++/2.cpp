/**
@no 2
@name  反转链表
*/

class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        // 首先创建当前的下一个节点 当前节点 空结点
        ListNode *temp;
        ListNode *cur = head;
        ListNode *pre = NULL;
        while(cur)
        {
            //判断节点是否为空
            temp = cur -> next;
            //使当前节点为空结点
            cur -> next = pre; 
            pre = cur;
            cur = temp;
        }
        return pre;

    }
};

