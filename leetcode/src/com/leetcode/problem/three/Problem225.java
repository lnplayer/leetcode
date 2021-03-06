package com.leetcode.problem.three;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implement Stack using Queues
 * @author ln
 *
 */
public class Problem225 {
//Push element x onto stack.
  Queue<Integer> q1 = new LinkedList<Integer>();
  Queue<Integer> q2 = new LinkedList<Integer>();
  public void push(int x) {
      q1.offer(x);
  }

  // Removes the element on top of the stack.
  public void pop() {
      while(q1.size()>1){
          q2.offer(q1.poll());
      }
      q1.poll();
      Queue tmp = q1;
      q1 = q2;
      q2 = tmp;
  }

  // Get the top element.
  public int top() {
      while(q1.size()>1){
          q2.offer(q1.poll());
      }
      int topN = q1.peek();
      q2.offer(q1.poll());
      
      Queue tmp = q1;
      q1 = q2;
      q2 = tmp;
      return topN;
  }

  // Return whether the stack is empty.
  public boolean empty() {
      return q1.isEmpty();
  }
}
