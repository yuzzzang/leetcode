class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        for(int i=1;i<nums.length;i++){
            //값이 중복되지 않을때만 배열을 update
            if(nums[i]!=nums[i-1]){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}