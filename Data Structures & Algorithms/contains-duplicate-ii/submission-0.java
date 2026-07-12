class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>seen=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(seen.containsKey(nums[i])){
                int prev=seen.get(nums[i]);
                int curr=i;
                int diff=Math.abs(prev-curr);
                if(diff<=k){
                return true;
                }
            }
                seen.put(nums[i],i);
        }
        return false;
    }
}