
/* QNo:3 Longest Substring Without Repeating Characters
Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

*/
//Solution 1

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        if(s.length()==1){
            return 1;
        }
        HashMap<Character,Integer> hm = new HashMap<>();        
        for(int i=0;i<s.length();i++){
            int j = i;
            int count=0;
            while(j<s.length()) {
            if(!(hm.containsKey(s.charAt(j)))){
                hm.put(s.charAt(j),1);
                count++;
                j++;
                if(count > result){
                result = count;
            }} else{
              hm.clear();
              count = 0;
              break; }}}
        return result; 
    }
}

//Solution 2
    
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        HashSet<Character> hs = new HashSet<>();
        int i=0,j=0;
        while(j<s.length()){
            if(!hs.contains(s.charAt(j))){
                hs.add(s.charAt(j));
                result = Math.max(hs.size(),result);
                j++;
            } else {
                hs.remove(s.charAt(i));
                i++;
            }
        }
        return result;

    }
}
