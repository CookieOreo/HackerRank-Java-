/*
Author: Raymond Chen 
Description: HackerRank Challenge. Sun Jan. 17th 2016
All Domains > Algorithms > Warmup > Diagonal Difference

Problem Statement:

Given a square matrix of size N × N, calculate the absolute difference between the sums of its diagonals.

Input Format:
The first line contains a single integer, N. The next N lines denote the matrix's rows, with each line containing N space-separated integers describing the columns.

Output Format:
Print the absolute difference between the two sums of the matrix's diagonals as a single integer.

Sample Input:

3
11 2 4
4 5 6
10 8 -12
Sample Output

15

Explanation

The primary diagonal is: 
11
    5
       -12

Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:
      4
   5
10

Sum across the secondary diagonal: 4 + 5 + 10 = 19 
Difference: |4 - 19| = 15
*/
import java.io.*;
import java.util.*;

public class DiagonalDifference{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int primary,secondary,difference;
        primary = secondary = difference = 0;
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                if(a_i == a_j){
              //finds the number needed for primary diagonal and directly adds it. They're at (1,1),(2,2),(3,3),(4,4),...,(n,n). (Placesaver)
                    primary += a[a_i][a_j];
                }
            }
       //finds the number needed for secondary diagonal and directly adds it. They're at (1,n),(2,n-1),(3,n-2),(4,n-3),...,(n,n-(n-1)).
            secondary += a[a_i][n-a_i-1];
        }
       //calculates the difference of the primary and secondary diagonals
        difference = primary - secondary;
        //checks if it's a negative, if so make it positive (i know i could use absolute value function but this is just easier to understand)
        if (difference < 0){
        difference *= -1;
        }
        System.out.println(difference);
    }
}