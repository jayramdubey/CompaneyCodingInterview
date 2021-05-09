package com.blume;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*Input: aabcbcdbca -> abcd 
Output: dbca
Explanation: 
Possible substrings= {aabcbcd, abcbcd, 
bcdbca, dbca....}
Of the set of possible substrings 'dbca' 
is the shortest substring having all the 
distinct characters of given string. 

Input: aaab
Output: ab
Explanation: 
Possible substrings={aaab, aab, ab}
Of the set of possible substrings 'ab' 
is the shortest substring having all 
the distinct characters of given string. 
*/
public class AllChar {

	static final int MAX_CHARS = 256;

	public static void main(String args[]) {
		String str = "aabcbcdbca";
		int result = findSubString(str);
		System.out.println("Smallest window containing all distinct" + " characters is: " + result);
	}

	public static int findSubString(String str) {
		int n = str.length();

		int dist_count = 0;

		boolean[] visited = new boolean[MAX_CHARS];
		Arrays.fill(visited, false);
		for (int i = 0; i < n; i++) {
			if (visited[str.charAt(i)] == false) {
				visited[str.charAt(i)] = true;
				dist_count++;
			}
		}
		int start = 0;
		int min_len = Integer.MAX_VALUE;

		int count = 0;
		int[] curr_count = new int[MAX_CHARS];
		for (int j = 0; j < n; j++) {

			curr_count[str.charAt(j)]++;

			if (curr_count[str.charAt(j)] == 1)
				count++;

			if (count == dist_count) {
				while (curr_count[str.charAt(start)] > 1) {
					if (curr_count[str.charAt(start)] > 1)
						curr_count[str.charAt(start)]--;
					start++;
				}

				int len_window = j - start + 1;
				if (min_len > len_window) {
					min_len = len_window;
				}
			}
		}

		return min_len;
	}

}
