class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count=0;
        int left=0;
        int right=people.length-1;
        Arrays.sort(people);
        while(left<=right){
            if(people[right]==limit){
                count++;
                right--;
            }
            else if(people[left]==limit){
                count++;
                left++;
            }
            else if(people[left]+people[right]<=limit){
                count++;
                right--;
                left++;
            }
            else{
                count++;
                right--;
            }
        }
        return count;
        
    }
}