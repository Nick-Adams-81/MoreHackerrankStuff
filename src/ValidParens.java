import java.util.Stack;

public class ValidParens {

    public boolean validParens(String str) {
        if(str.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()) {
            if(c == '{' || c == '[' || c == '(') stack.push(c);
            else if(c == '}' && stack.peek() == '{') stack.pop();
            else if(c == ']' && stack.peek() == '[') stack.pop();
            else if(c == ')' && stack.peek() == '(') stack.pop();
        }
        return stack.isEmpty();
    }
}
