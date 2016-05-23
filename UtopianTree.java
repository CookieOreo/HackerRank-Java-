/*
Author: Raymond Chen 
Description: HackerRank Challenge. Tue Jan. 19th 2016
All Domains > Algorithms > Implementation > Utopian Tree
Website: https://www.hackerrank.com/challenges/utopian-tree
*/

import java.io.*;
import java.util.*;

public class UtopianTree {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int trials = in.nextInt();
        int[] numberOfTrials = new int[trials];
        int[] results = new int[trials];
        for(int a0 = 0; a0 < trials; a0++){
            int n = in.nextInt();
            numberOfTrials[a0] = n;
        }
        int resultHeight = 1;
        for(int a0 = 0; a0 < numberOfTrials.length; a0++){
            while (numberOfTrials[a0] > 0){
                    resultHeight = (resultHeight * 2) + 1;
                    numberOfTrials[a0] -= 2;
            }
            if (numberOfTrials[a0] == -1){
                results[a0] = resultHeight - 1;
            }
            else {
                results[a0] = resultHeight;
            }
            resultHeight = 1;
        }
        //prints out all the results
        for(int a0 = 0; a0 < results.length; a0++){
            System.out.println(results[a0]);
        }
    }
}