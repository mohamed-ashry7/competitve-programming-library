package leetcode;


public class p136_Single_Number {

	public int singleNumber(int[] nums) {
		int tar = 0;
		for (int i = 0; i < nums.length; i++) {
			tar ^= nums[i];
		}
		return tar;

	}

}
