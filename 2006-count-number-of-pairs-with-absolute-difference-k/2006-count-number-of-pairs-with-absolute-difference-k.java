class Solution {
    public int countKDifference(int[] nums, int k) {
        int[] count=new int [201];
        for(int num :nums){
            count[num]++;
        }
        int total=0;
        for(int num:nums){
            int check=k+num;
            if(count[check]!=0){
                total+=count[check];
            }
        }
        return total;
        
        
    }
}