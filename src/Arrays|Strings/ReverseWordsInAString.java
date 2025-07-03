import java.util.Stack;

class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') { // Checking for space instead of '-'
                if (sb.length() == 0) {
                    continue;
                } else {
                    stack.push(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(ch);
            }
        }

        if (sb.length() != 0) {
            stack.push(sb.toString());
        }

        sb.setLength(0); // Reset StringBuilder

        while (stack.size() > 1) {
            sb.append(stack.pop()).append(' ');
        }

        sb.append(stack.pop()); // Append last word without space
        return sb.toString();
    }
}

class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String x = "the sky is blue";
        System.out.println(s.reverseWords(x)); // Output: "blue is sky the"
    }
}
