/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stack_in_ll;

/**
 *
 * @author N TECH
 */
public class Stack_in_array {
    private int top = -1; // Points to the top of the stack
    int[] num = new int[5]; // Stack with a fixed size of 5

    // Push an element onto the stack
    public void push(int data) {
        if (top == 4) { // Check if stack is full (Stack Overflow)
            System.out.println("Stack Overflow!");
            return;
        }
        num[++top] = data; // Increment top and add element
    }

    // Pop the top element from the stack
    public int pop() {
        if (top == -1) { // Check if the stack is empty (Stack Underflow)
            System.out.println("Stack Underflow!");
            return -1; // Return -1 or any other value indicating underflow
        }
        return num[top--]; // Return the top element and decrement the top
    }

    // Peek at the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) { // Check if the stack is empty
            System.out.println("Stack is empty! No elements to peek.");
            return -1; // Return -1 or any other value indicating the stack is empty
        }
        return num[top]; // Return the top element
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1; // Return true if the stack is empty
    }

    // Return the number of elements in the stack
    public int size() {
        return top + 1; // Number of elements is top + 1
    }

    // Display the stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    // Main method to test stack operations
    public static void main(String[] args) {
        Stack_in_array stack = new Stack_in_array();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();

        // Attempt to push onto a full stack
        stack.push(60); // This will trigger stack overflow

        // Peek at the top element
        System.out.println("Peek at top element: " + stack.peek());

        // Pop elements from the stack
        stack.pop();
        stack.pop();
        stack.display();

        // Size of the stack
        System.out.println("Stack size: " + stack.size());

        // Pop all elements
        stack.pop();
        stack.pop();
        stack.pop();
        stack.display();

        // Try to pop from an empty stack
        stack.pop(); 
    }
}

