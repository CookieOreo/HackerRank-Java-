/*
Author: Raymond Chen 
Description: HackerRank Challenge. Mon Jan. 18th, 2016
All Domains > Algorithms > Warmup > Staricase

Problem Statement:

Your teacher has given you the task of drawing a staircase structure. Being an expert programmer, 
you decided to make a program to draw it for you instead. Given the required height, can you print a staircase as shown in the example?

Input:
You are given an integer N depicting the height of the staircase.

Output:
Print a staircase of height N that consists of # symbols and spaces. For example for N=6, here's a staircase of that height:

     #
    ##
   ###
  ####
 #####
######
Note: The last line has 0 spaces before it.

*/

import java.io.*;
import java.util.*;

public class Staircase {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= n; i++){
        	for(int j = n-i; j > 0; j--){
        		System.out.print(" ");
        	}
        	for(int k = 0; k < i; k++){
        		System.out.print("#");
        	}
        	System.out.println();
        }
    }
}