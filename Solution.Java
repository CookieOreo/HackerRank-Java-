/*
Author: Raymond Chen 
Description: HackerRank Challenge. Jan. 13th 2016
All Domains > Algorithms > Warmup > Simple Array Sum

Problem Statement:

You are given an array of integers of size N. Can you find the sum of the elements in the array?

Input:
The first line of input consists of an integer N. The next line contains N space-separated integers representing the array elements. 
Sample:

6
1 2 3 4 10 11
Output:
Output a single value equal to the sum of the elements in the array. 
For the sample above you would just print 31 since 1+2+3+4+10+11=31.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n; 
        int sum = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(int i = 0; i < n; i++){
            //directly adds as they're inputting number
            sum += in.nextInt();
        }
        System.out.println(sum);
    }
}