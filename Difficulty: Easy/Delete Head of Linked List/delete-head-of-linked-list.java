/* Structure of Linked List Node
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
} */

class Solution {
    public Node deleteHead(Node head) {
     
                if (head == null) {
                    return null;
                }

                Node temp = head;
                head = head.next;
                temp.next = null; 
                return head;
            }
        }
    