/* QNo:49 Group Anagrams

Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]
*/

class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> hm = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String orgStr = strs[i];
            char[] ch = orgStr.toCharArray();
            Arrays.sort(ch);
            String str = String.valueOf(ch);
            //String str = String.copyValueOf(ch);
            if(hm.containsKey(str)){
                ArrayList ar = hm.get(str);
                ar.add(orgStr);
                hm.put(str,ar);
            } else {
                ArrayList ar = new ArrayList<>();
                ar.add(orgStr);
                hm.put(str,ar);
            }
        }
        return new ArrayList<>(hm.values());     
    }
}
/* Time Complexity : O(N)
*/