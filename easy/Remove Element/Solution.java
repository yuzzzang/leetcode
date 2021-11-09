class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        if(nums.length == 1){
            if(nums[0]==val){
                return 0;
            }
            else{
                return 1;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count] = nums[i];
                count ++;
             }
        }
        
        if(nums.length == count-1){
            return nums.length;
        }

        return count;
        
    }
}