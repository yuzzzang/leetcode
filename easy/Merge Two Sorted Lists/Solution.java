/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 /*
    Your input
    [1,2,4]
    [1,3,4]
    
    stdout
    l2:1
    l2:1
    l1:2
    l2:3
    l2:4

 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1==null)  return l2;
        if(l2==null)  return l1;

        if(l1.val < l2.val){
            System.out.println("l1:"+l1.val);
            l1.next = mergeTwoLists(l1.next, l2) ;

            return l1;
           
        }else{
             System.out.println("l2:"+l2.val);
             l2.next = mergeTwoLists(l2.next,l1);
    
             return l2;
            }

    }
}