class Solution {
    public int totalFruit(int[] nums) {
        int left=0;
        int right=0;
        int maxlen=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        while(right<nums.length){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.size()>2){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0) map.remove(nums[left]);
                left++;

            }
            if(map.size()<=2){
                maxlen=Math.max(maxlen,right-left+1);
            }
            right++;
        }
        return maxlen;

        
    }
}