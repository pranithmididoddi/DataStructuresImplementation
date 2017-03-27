import java.util.Arrays;

/**
 * Created by Pranith on 3/26/17.
 */
public class Stack {

    private int maxSize;
    private int[] stackarray;
    private int top;


    public Stack(int x){
        maxSize=x;
        stackarray= new int[maxSize];
        top=-1;
    }

    public void push(int x){
       stackarray[++top]=x;
    }

    public int pop(){
        return stackarray[top--];
    }

    public int peek(){
        return stackarray[top];
    }

    public boolean isEmpty(){
        return (top==-1);
    }

    public boolean isFull(){
        return (top==maxSize-1);
    }

    public void printstack(){
        System.out.println(Arrays.toString(stackarray));
    }
}
