package Microsoft;

import java.util.*;

class ReversePolish {
    public int evalRPN(String[] tokens) {

        Stack<Integer> s = new Stack<>();
        for (String t : tokens) {
            if ("+-*/".contains(t))
                s.push(evaluate(s.pop(), s.pop(), t));

            else
                s.push(Integer.parseInt(t));
        }
        return s.pop();
    }

    public int evaluate(int b, int a, String c) {
        if (c.equals("+"))
            return a + b;
        else if (c.equals("-"))
            return a - b;
        else if (c.equals("*"))
            return a * b;
        else
            return a / b;
    }
}