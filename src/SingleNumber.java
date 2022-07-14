public class SingleNumber {
    //https://leetcode.com/problems/single-number/
    public int singleNumber(int[] nums) {
        int xor=0;
        for(Integer i :nums){
            xor=xor^i;
        }
        return xor;
    }
}
