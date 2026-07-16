class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int right=0;
        int maxfreq=0;
        int maxlen=0;
        HashMap<Character,Integer>map=new HashMap<>();
        while(right<s.length()){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxfreq=Math.max(maxfreq,map.get(ch));
            if((right-left+1)-maxfreq>k){
                char bh=s.charAt(left);
                map.put(bh,map.get(bh)-1);
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
        
        
        
    }
}
