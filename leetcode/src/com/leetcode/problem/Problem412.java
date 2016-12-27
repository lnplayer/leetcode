package com.leetcode.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * Fizz Buzz
 * @author ln
 *
 */
public class Problem412 {
	public List<String> fizzBuzz(int n) {
    ArrayList<String> result = new ArrayList<String>();
    for(int i=1;i<=n;i++){
        if(i%3==0 && i%5==0){
            result.add("FizzBuzz");
        }
        else if(i%3==0){
            result.add("Fizz");
        }
        else if(i%5==0){
            result.add("Buzz");
        }
        else{
            result.add(i+"");
        }
    }
    return result;
  }
}
