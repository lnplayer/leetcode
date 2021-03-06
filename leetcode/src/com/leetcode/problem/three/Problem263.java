package com.leetcode.problem.three;

/**
 * Ugly Number
 * @author ln
 *
 */
public class Problem263 {

	public boolean isUgly(int num) {
    if (num == 1) return true;
    if (num < 1) return false;
    while(num != 1 ){
    	while(num%2==0) num = num/2;
    	while(num%3==0) num = num/3;
    	while(num%5==0) num = num/5;
    	if(num != 1) return false;
    }
    return true;
  }
}
