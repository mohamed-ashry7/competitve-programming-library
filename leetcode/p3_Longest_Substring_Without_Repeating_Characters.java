package leetcode;

import java.util.HashSet;

public class p3_Longest_Substring_Without_Repeating_Characters {

	public static int lengthOfLongestSubstring(String s) {

		int max = 0;
		for (int i = 0; i < s.length(); i++) {

			int count = 1;
			HashSet<Character> set = new HashSet<>();
			set.add(s.charAt(i));
			for (int j = i + 1; j < s.length(); j++) {
				if (set.contains(s.charAt(j))) {
					break;
				}
				count++;
				set.add(s.charAt(j));

			}
			if (count>max) {
				max = count; 
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("a"));
	}

}
