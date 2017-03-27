import java.util.List;

/**
 * Created by Pranith on 3/27/17.
 */
public class ListNode {

    private static ListNode head;
    private ListNode next;
    private int val;

    public ListNode(int val){
        this.val=val;
    }

    public void addHead(int data){
        ListNode temp=new ListNode(data);
        temp.next=head;
        head=temp;
    }

    public void addTail(int data){
        while(head!=null){
            head=head.next;
        }

        ListNode temp=new ListNode(data);
        head.next=temp;
        head=temp;
    }

    public void printall(){
        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }
}
