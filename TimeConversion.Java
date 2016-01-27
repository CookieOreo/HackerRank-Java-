/*
Author: Raymond Chen 
Description: HackerRank Challenge. Tue Jan. 19th 2016
All Domains > Algorithms > Warmup > Time Conversion

Problem Statement:

Given a time in AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock and 12:00:00 on a 24-hour clock.

Input Format:

A time in 12-hour clock format (i.e.: hh:mm:ssAM or hh:mm:ssPM), where 01≤hh≤12.

Output Format:

Convert and print the given time in 24-hour format, where 00≤hh≤23.

Sample Input:

07:05:45PM
Sample Output

19:05:45
Explanation

7 PM is after noon, so you need to add 12 hours to it during conversion. 12 + 7 = 19. 
Minutes and seconds do not change in 12-24 hour time conversions, so the answer is 19:05:45.
*/

import java.io.*;
import java.util.*;

public class TimeConversion {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //Scans in the input (need to include checks for correct input for hour minutes seconds and AM/PM)
        Scanner in = new Scanner(System.in);
        String time = in.next();
        int fdigit, sdigit;
        fdigit = sdigit = 1;
        String[] timearray = time.split("");
        //if it's PM then checks if it's 12:XX:XXPM first since it doesn't change, then does the appropriate addition
        if (timearray[8].equals("P")){
        	if(timearray[0].equals("1") && timearray[1].equals("2")){
                fdigit = 1;
                sdigit = 2;
        	}
        	else{
        		//adds 1 to the 1st digit of hour
                fdigit = Integer.parseInt(timearray[0]) + 1;
        		//adds 2 to 2nd digit of hour 
                sdigit = Integer.parseInt(timearray[1]) + 2;
        	}
        }
        else{
            //if it's AM checks if it's 12:XX:XXAM first since that's 00:XX:XX, else does nothing.
        	if(timearray[0].equals("1") && timearray[1].equals("2")){
                fdigit = 0;
                sdigit = 0;
        	}
            else{
                fdigit = Integer.parseInt(timearray[0]);
                sdigit = Integer.parseInt(timearray[1]);
            }
        }
        //prints our first and second digit since those are the hour digits and are the only ones being affected
        System.out.print(fdigit);
        System.out.print(sdigit);
        //then prints out all the other characters excluding the "AM/PM"
        for(int i = 2; i < timearray.length - 2; i++){
        	System.out.print(timearray[i]);
        }
    }
}