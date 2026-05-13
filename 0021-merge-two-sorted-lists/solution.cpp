/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        ListNode* p1;ListNode* p2;
        p1=list1; p2=list2;
        ListNode dummy;
        ListNode* t1=&dummy;
        while(p1!=NULL && p2!=NULL){
            if(p1->val < p2->val){
                t1->next = p1;
                p1 = p1->next;
            } else {
        t1->next = p2;
        p2 = p2->next;
    }

    t1= t1->next;
        }
    if(p1 != NULL)
    t1->next = p1;
else
    t1->next = p2;
return dummy.next;
    }
};
