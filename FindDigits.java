/*
Author: Raymond Chen (Zhen Ye Chen)
Description: HackerRank Challenge. Fri May. 27th 2016
All Domains > Algorithms > Implementation > Find Digits
Website: https://www.hackerrank.com/challenges/find-digits
*/

import java.io.*;
import java.util.*;

public class FindDigits {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //first asks how many trials there will be
        Scanner in = new Scanner(System.in);
        int trials = in.nextInt();
        int[] arr = new int[100];
        int[] results = new int[15];
        int i = 0;
        int count = 0;
        for (int a0 = 0; a0 < trials; a0++){
        	//prompts for the number that wants to be performed on
        	int number = in.nextInt();
        	int copy = number;
        	//breaks down the number into array (i.e 1024 --> {1,0,2,4})
        	while (copy != 0){
        		arr[i] = copy % 10;
        		copy /= 10;
        		i++;
        	}
        	//meat of the program that finds if the number is divisble by the digits
        	for (int a1 = 0; a1 < arr.length; a1++){
        		if (arr[a1] != 0 && number % arr[a1] == 0){
        			count++;
        		}
        		//resets array as it traverses through it
        		arr[a1] = 0;
        	}
        	//stores this results and resets counters 
        	results[a0] = count;
        	i = count = 0;
    	}
    	for (int a0 = 0; a0 < trials; a0++){
    		System.out.println(results[a0]);
    	}
    }
}