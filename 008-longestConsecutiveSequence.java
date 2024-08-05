/* QNo:128 Longest Consecutive Sequence

Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
*/

class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        for(int curr:hs){
            if(!hs.contains(curr-1)){
                int y = curr+1;
                while(hs.contains(y)){
                    y++;
                }
                result = Math.max(result,y-curr);
            }
        }
        return result;
    }
}
