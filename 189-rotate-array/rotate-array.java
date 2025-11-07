class Solution {
    public void rotate(int[] nums, int k) {
        int index = nums.length;
        k=k%index;
        int[] temp = new int[index];
        for(int i=0 ; i < index ; i++){
           temp[(i+k)%index] = nums[i];

        }
        for(int i=0 ; i<index ; i++){
            nums[i]= temp[i];
        }
        
    }
}