package leetCode.Easy.Array;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] sumIndex = new int[2];
        int len = nums.length;

        for(int i=0; i<len; i++) {
            found:
            for(int j=i+1; j<len; j++) {
                int sum = nums[i] + nums[j];
                if(sum == target) {
                    sumIndex[0] = i;
                    sumIndex[1] = j;
                    break found;
                }
            }
        }
        return sumIndex;
    }
}
