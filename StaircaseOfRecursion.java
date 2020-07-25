/* Overlapping subproblems:
    - when you have a recursive method that breaks a problem into subproblems, and some of the
      subproblems are the same.  Recognizing this is important because these subproblems can 
      be memoized or tabulated to speed up the function.  This has the potential to remove many
      branches of the recursion tree.

    - MEMOIZATION
        * Make an array filled with nulls to store the solutions.  If the recursive algorithm
          finds a solution that isn't in the array, it adds either the base case to the array
          or another recursive solution to the array.  Else, it just returns the solution in
          the array.
        * E.g.:

        #include <bits/stdc++.h> 
        using namespace std; 
        #define NIL -1  
        #define MAX 100  
  
        int lookup[MAX];  

        //Function to initialize NIL values in lookup table
        
        void _initialize()  
        {  
            int i;  
            for (i = 0; i < MAX; i++)  
                lookup[i] = NIL;  
        }  
        
        // function for nth Fibonacci number
        int fib(int n)  
        {  
            if (lookup[n] == NIL)  
            {  
                if (n <= 1)  
                   lookup[n] = n;  
                else
                    lookup[n] = fib(n - 1) + fib(n - 2);  
        }  
  
        return lookup[n];  
        }  
  
        // Driver code 
        int main ()  
        {  
            int n = 40;  
            _initialize();  
            cout << "Fibonacci number is " << fib(n);  
            return 0;  
        }  
  
        // This is code is contributed by rathbhupendra 
*/

import java.util.*;

public class StaircaseOfRecursion {

    private static final int MAX = 100;
    private static int[] table = new int[MAX];

    public static int waysToClimb(int num) {

        if(table[num] == -1) {
            if(num == 2) {
                table[num] = 2;
            } else if(num <= 1) {
                table[num] = 1;
            } else {
                table[num] = waysToClimb(num - 1) + waysToClimb(num - 2);
            }
        }

        return table[num]; 

    }

    public static void main(String[] args) {

        Arrays.fill(table, -1);

        System.out.println(waysToClimb(4));

    }
}