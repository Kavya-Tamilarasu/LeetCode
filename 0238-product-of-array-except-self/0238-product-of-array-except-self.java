class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftpro=new int[nums.length];
        int[] rightpro=new int[nums.length];
        leftpro[0]=1;
        rightpro[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            leftpro[i]=leftpro[i-1]*nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            rightpro[i]=rightpro[i+1]*nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            if(i==0){
                nums[i]=rightpro[i];
            }else if(i==nums.length-1){
                nums[i]=leftpro[i];
            }else{
                nums[i]=leftpro[i]*rightpro[i];
            }
        }
        return nums;
    }
}