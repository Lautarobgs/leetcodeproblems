/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode* newList = NULL;
    while(head != NULL)
    {
        struct ListNode* current = head;
        head=head->next;
        current->next = newList;
        newList = current;
    }
    return newList;
}