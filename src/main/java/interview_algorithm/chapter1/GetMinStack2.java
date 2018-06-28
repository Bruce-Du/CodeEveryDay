package interview_algorithm.chapter1;

import java.util.Stack;

public class GetMinStack2 {
    private Stack<Integer> stackData, stackMin;

    public GetMinStack2(){
        stackData = new Stack<Integer>();
        stackMin = new Stack<Integer>();
    }

    public int pop(){
        if(this.stackData.isEmpty()){
            throw new RuntimeException("You Stack is Empty");
        }else {
            stackMin.pop();
            return stackData.pop();
        }
    }

    public void push(int num){

        if(!this.stackMin.isEmpty() && num > this.stackMin.peek()){
            this.stackMin.push(this.stackMin.peek());
        }else{
            this.stackMin.push(num);
        }

        this.stackData.push(num);
    }

    public int getmin(){
        return this.stackMin.peek();
    }

    public void printContent(){
        System.out.printf("stackData\t");
        if(this.stackData.isEmpty()){
            System.out.println("Empty!");
        }else{
            for(int content: stackData){
                System.out.printf(content + "  ");
            }
        }
        System.out.println();

        System.out.printf("stackMin\t");
        if(this.stackMin.isEmpty()){
            System.out.println("Empty");
        }else {
            for (int content : stackMin) {
                System.out.printf(content + "  ");
            }
        }
        System.out.println();
    }
}
