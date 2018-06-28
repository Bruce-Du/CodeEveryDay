package interview_algorithm.chapter1;

import java.util.Stack;

public class GetMinStack1 {
	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;

	public GetMinStack1(){
		this.stackData = new Stack<Integer>();
		this.stackMin =  new Stack<Integer>();
	}

	public void push(int newNum){
		if(this.stackMin.isEmpty()){
			this.stackMin.push(newNum);
		}else if(newNum <= this.getmin()){
			this.stackMin.push(newNum);
		}
		this.stackData.push(newNum);
	}

	public int pop(){

		if(this.stackData.isEmpty()){
			throw new RuntimeException("Your stack is empty.");
		}
		int value = this.stackData.pop();
		if(value == this.getmin()){
			this.stackMin.pop();
		}

		return value;
	}

	public int getmin(){
		if(this.stackMin.isEmpty()){
			throw new RuntimeException("Your stack is empty.");
		}

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