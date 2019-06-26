package com.lixinxinlove.stack;


import java.util.Stack;

/**
 * 匹配括号
 */
public class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int j = 0; j < s.length(); j++) {

            char c = s.charAt(j);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (c == ')' && top != '(') {
                    return false;
                }
                if (c == ']' && top != '[') {
                    return false;
                }
                if (c == '}' && top != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
