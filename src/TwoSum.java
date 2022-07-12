import java.util.ArrayList;

public class TwoSum {
    //https://leetcode.com/problems/two-sum/
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> array=new ArrayList<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};

    }
}
