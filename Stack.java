/**
 * This is the class to implement a stack.
 * 
 * The stack should hold string data and have a constructor with one
 * integer parameter (the size of the stack).
 * 
 * @author Michael Ida
 *
 */
public class Stack implements StackInterface {

	private String[] stackArray;
	private int stackSize;
	private int top;
	
	public Stack(int size) {
		stackSize = size;
		stackArray = new String[size];
		top = -1;
	}
	
	public boolean push(String record) {
		if (top == stackSize - 1) {
			return false;
		} else {
			top++;
			stackArray[top] = record;
			return true;
		}
	}
	
	public String pop() {
		if (top < 0) {
			return "";
		} else {
			top--;
			return stackArray[top + 1];
		}
	}
	
	public void printStack() {
		for (int i = top; i >= 0; i--) {
			System.out.println(stackArray[i]);
		}
		System.out.println();
	}
	
}
