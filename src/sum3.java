import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sum3 {
    //https://leetcode.com/problems/3sum/
    List<List<Integer>> array=new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            if(nums[i]==0 &&nums[j]==0 &&nums[k]==0){
                array.add(Arrays.asList(0,0,0));
                return array;
            }
            while(j<=k){

                if(nums[i]+nums[j]+nums[k]==0){
                    array.add(Arrays.asList(nums[i],nums[j],nums[k]));
                }
                j++;
                k--;

            }
        }
        return array;

    }
}
