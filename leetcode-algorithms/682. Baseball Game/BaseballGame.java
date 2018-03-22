import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] ops) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            switch (ops[i]) {
                case "+":
                    Integer tmp=stack.pop();
                    Integer sum=tmp+stack.peek();
                    stack.push(tmp);
                    stack.push(sum);
                    break;
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(2*stack.peek());
                    break;
                default:
                    stack.push(Integer.valueOf(ops[i]));
                    break;
            }
        }
        while (!stack.empty()){
            result+=stack.pop();
        }
        return result;
    }
}
