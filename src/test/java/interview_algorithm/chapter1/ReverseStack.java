package interview_algorithm.chapter1;

import java.util.Stack;

/**
 * 如何仅用递归函数和栈操作逆序一个栈
 */
public class ReverseStack {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 1; i < 6; i ++){
            stack.push(i);
        }

        System.out.println(getAndRemoveLastElement(stack));


    }

    private static int getAndRemoveLastElement(Stack<Integer> stack){
        int result = stack.pop();

        if(stack.isEmpty()){
            return result;
        }else{
            int last = getAndRemoveLastElement(stack);
            stack.push(result);
            return last;
        }
    }

    private static void reverseStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }

        int i = getAndRemoveLastElement(stack);
        reverseStack(stack);
        stack.push(i);
    }
}
