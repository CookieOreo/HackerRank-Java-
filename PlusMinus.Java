/*
Author: Raymond Chen 
Description: HackerRank Challenge. Mon Jan. 18th, 2016
All Domains > Algorithms > Warmup > Plus Minus

Problem Statement:

Given an array of integers, calculate which fraction of the elements are positive, negative, and zeroes, respectively. Print the decimal value of each fraction.

Input Format:

The first line, N, is the size of the array. 
The second line contains N space-separated integers describing the array of numbers (A1,A2,A3,⋯,AN).

Output Format:

Print each value on its own line with the fraction of positive numbers first, negative numbers second, and zeroes third.

Sample Input:

6
-4 3 -9 0 4 1         
Sample Output:

0.500000
0.333333
0.166667
Explanation:

There are 3 positive numbers, 2 negative numbers, and 1 zero in the array. 
The fraction of the positive numbers, negative numbers and zeroes are 3/6=0.500000, 2/6=0.333333 and 1/6=0.166667, respectively.

Note: This challenge introduces precision problems. 
The test cases are scaled to six decimal places, though answers with absolute error of up to 10^−4 are acceptable.
*/


import java.io.*;
import java.util.*;

public class PlusMinus {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double positive, negative, zero;
        positive = negative = zero = 0.0;
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
        	arr[arr_i] = in.nextInt();
        	if(arr[arr_i] > 0){
        		positive++;
        	}
        	else if (arr[arr_i] < 0) {
        		negative++;
        	}
        	else{
        		zero++;
        	}
        }
        System.out.println(positive / n);
        System.out.println(negative / n);
        System.out.println(zero / n);
    }
}