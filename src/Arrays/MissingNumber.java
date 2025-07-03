class Solution {
    public int missingNumber(int[] nums) {
        cycle(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!= i)
                return i;
        }
        return nums.length;
        
    }
    public void cycle(int[] arr){
        int i=0;
        while(i<arr.length){
            int c=arr[i];
            if(c<arr.length && arr[c]!=arr[i]){
                arr[c]=arr[c] ^ arr[i];
                arr[i]=arr[c] ^ arr[i];
                arr[c]=arr[c] ^ arr[i];
            }
            else{
                i++;
            }
        }
    }
}
