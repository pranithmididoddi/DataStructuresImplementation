/**
 * Created by Pranith on 3/26/17.
 */
public class Main {
/**stack implementation*/
    public static void main(String[] args){
        Stack stack=new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.printstack();

        ListNode list=new ListNode(10);
        list.addTail(12);
        list.addTail(13);
        list.addTail(14);

        list.printall();
    }
}
