package com.ikennascode;

import java.util.Stack;

public class WorkingWithStack {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        stack.push("Mathematics");
        stack.push("English");
        stack.push("Chemistry");
        stack.push("Biology");

        stack.pop();
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.empty());
    }

}

