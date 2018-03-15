/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function (l1, l2) {
    var result = new ListNode(0);
    var carry = 0;
    var p1 = l1, p2 = l2, r = result;
    while (p1 || p2) {
        var x = (p1) ? p1.val : 0;
        var y = (p2) ? p2.val : 0;
        var tmp = x + y + carry;
        r.next = new ListNode(tmp % 10);
        carry = parseInt(tmp / 10);//舍弃小数，保留整数
        if (p1) p1 = p1.next;
        if (p2) p2 = p2.next;
        r = r.next;
    }
    if (carry > 0) {
        r.next = new ListNode(carry);
    }
    return result.next;
};


function ListNode(val) {
    this.val = val;
    this.next = null;
}