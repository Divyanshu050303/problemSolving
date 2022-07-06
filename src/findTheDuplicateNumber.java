import java.util.Arrays;
//https://leetcode.com/problems/find-the-duplicate-number/submissions/
public class findTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return nums[i];
            }
        } return -1;
    }
}
