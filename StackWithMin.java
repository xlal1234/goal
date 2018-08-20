public class Solution {
  private Deque<Integer> stack;
  private Deque<Integer> minStack;
  public Solution() {
    // write your solution here
    stack = new LinkedList<Integer>();
    minStack = new LinkedList<Integer>();
  }
  
  public int pop() {
    if(stack.isEmpty()) {
      return -1;
    }
    int result = stack.pop();
    if (minStack.peek().equals(result)) {
      minStack.pop();
    }
    return result;
  }
  
  public void push(int element) {
    stack.push(element);
    if(minStack.isEmpty() || element <= minStack.peek()) {
      minStack.push(element);
    }
  }
  
  public int top() {
     if(stack.isEmpty()) {
      return -1;
    }
    return stack.peek();
  }
  public int peek() {
    if(stack.isEmpty()) {
      return -1;
    }
    return stack.peek();
  } 
  public int min() {
    if(minStack.isEmpty()) {
      return -1;
    }
    return minStack.peek();
  }
}