/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		
		int no_Games = input.nextInt();
		
		int[] leader = new int[no_Games];
		int[] lead = new int[no_Games];
		
		int score_1 = 0;
		int score_2 = 0;
		
		for (int i = 0; i < no_Games; i++) {
			int score_player1 = input.nextInt();
			int score_player2 = input.nextInt();
			
			score_1 += score_player1;
			score_2 += score_player2;
			
			if (score_1 > score_2) {
				lead[i] = score_1 - score_2;
				leader[i] = 1;
			} else {
				lead[i] = score_2 - score_1;
				leader[i] = 2;
			}
		}

		int index_leader = 0;
		int max = lead[0];

		for (int i = 1; i < no_Games; i++) {

			if(lead[i] > max){
				max = lead[i];
				index_leader = i;
			}
		}

		System.out.println(leader[index_leader] + " " + max);
	}
}
