/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stack_in_ll;

/**
 *
 * @author N TECH
 */
public class Stack_in_LL {
    // Inner class representing a node in the linked list
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;  // Represents the top of the stack

    public Stack_in_LL() {
        this.top = null;
    }

    // Push an element onto the stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop the top element from the stack
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty (Underflow)");
            return -1;  // Return -1 or any other value to indicate underflow
        }
        int popData = top.data;
        top = top.next;  // Move the top to the next node
        return popData;
    }

    // Peek at the top element without removing it
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;  // Return -1 to indicate an empty stack
        }
        return top.data;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;  
    }

    // Return the number of elements in the stack
    public int size() {
        int size = 0;
        Node current = top;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    // Main method to test stack operations
    public static void main(String[] args) {
        Stack_in_LL s = new Stack_in_LL();

        // Test push operation
        s.push(76);
        s.push(43);
        s.push(12);
        System.out.println("Peek: " + s.peek());  // Test peek (should return 12)

        // Test pop operation
        System.out.println("Popped: " + s.pop());  // Should pop 12
        System.out.println("Peek after pop: " + s.peek());  // Should return 43

        // Test isEmpty operation
        System.out.println("Is stack empty? " + s.isEmpty());  // Should return false

        // Test size operation
        System.out.println("Stack size: " + s.size());  // Should return 2

        // Push more elements
        s.push(98);
        System.out.println("Peek after pushing 98: " + s.peek());  // Should return 98
        System.out.println("Stack size after pushing 98: " + s.size());  // Should return 3

        // Pop all elements
        System.out.println("Popped: " + s.pop());  // Pop 98
        System.out.println("Popped: " + s.pop());  // Pop 43
        System.out.println("Popped: " + s.pop());  // Pop 76

        // Check if stack is empty
        System.out.println("Is stack empty? " + s.isEmpty());  // Should return true

        // Try popping from an empty stack
        System.out.println("Popped from empty stack: " + s.pop());  // Should show underflow message
    }
}
