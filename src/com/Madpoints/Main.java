package com.Madpoints;

/*Space Complexity
  1. Memory required to store program instructions
  2. Memory required to store constant values
  3. Memory required to store variable values
  4. And more

  Definition: Total amount of computer memory required by an algorithm
  to complete its execution is called as space complexity of that algorithm

  In a running a program memory is used for...
  Instruction Space:
    It is the amount of memory used to store compiled version of instructions.
  Environmental Stack:
    It is the amount of memory used to store information of partially executed functions at the time of function call.
  Data Space (Used to measure space complexity):
    It is the amount of memory used to store all the variables and constants.
    (This is how we measure space complexity) */

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    /*Constant Space Complexity
    * 2 bytes for 'a' and 2 bytes for the return value
    * total of 4 bytes for this methods execution.
    * If any algorithm requires a fixed amount of space
    * for all input values then that space complexity
    * is said to be Constant Space Complexity*/
    public static int square(int a) {
        return a*a;
    }

    /*Linear Space Complexity
    * If the amount of space required by an algorithm
    * is increased with the increase of input value,
    * then that space complexity is said to be Linear Space Complexity*/
    public static int sum(int array[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }

        return sum;
    }
    /*In above piece of code it requires:
    'n*2' bytes of memory to store array variable 'array[]'
    2 bytes of memory for integer parameter 'n'
    4 bytes of memory for local integer variables 'sum' and 'i' (2 bytes each)
    2 bytes of memory for return value.

    That means, totally it requires '2n+8' bytes of memory to complete its execution.
    Here, the amount of memory depends on the input value of 'n'.
    This space complexity is said to be Linear Space Complexity.*/
}
