public class SearchInsertPosition {
    //https://leetcode.com/problems/search-insert-position/
    public int searchInsert(int[] nums, int target) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                k=i;
            }
            if(nums[i]<target){
                k++;
            }
        }
        return k;
    }
}
