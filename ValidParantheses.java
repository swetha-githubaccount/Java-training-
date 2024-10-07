import java.util.*;

class ValidParantheses{


    // i) Using collection in stack.
    public static boolean isValid(String s) 
    {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') 
            {
                stack.push(c);
            } 
            else if (c == ')' || c == '}' || c == ']') 
            {
                if (stack.isEmpty()) 
                    return false;
                char top = stack.pop();
                if ((top == '(' && c!= ')') || (top == '{' && c!= '}') || (top == '[' && c!= ']')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean res = isValid(str);
        if(res == true)
            System.out.println("The given paranthesis are valid");
        else
            System.out.println("The given paranthesis are not valid");
        sc.close();


        // ii) Using user defined stack
        

        //iii) String methods

    }
}