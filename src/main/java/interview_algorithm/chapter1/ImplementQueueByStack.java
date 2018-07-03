package interview_algorithm.chapter1;

import java.util.Stack;

/**
 * 由两个栈组成的队列
 */
public class ImplementQueueByStack {
    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;


    public ImplementQueueByStack(){
        stackPush = new Stack<Integer>();
        stackPop = new Stack<Integer>();
    }

    public void add(int num){
        stackPush.push(num);
    }

    public int poll(){
        if(stackPop.empty() && stackPush.empty()){
            throw new RuntimeException("Queue is empty");
        }else if(stackPop.empty()){
            while(!stackPush.empty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    public int peek(){
        if(stackPop.empty() && stackPush.empty()){
            throw new RuntimeException("Queue is empty");
        }else if(stackPop.empty()){
            while(!stackPush.empty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }

    public void printContent(){
        System.out.printf("stackPush\t" + stackPush + "stackPop\t" + stackPop);
    }
}
