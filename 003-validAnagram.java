/* QNo:242 Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                int count = hm.get(s.charAt(i));
                hm.put(s.charAt(i),count+1);
            } else {
                hm.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(hm.containsKey(t.charAt(i))){
                int count = hm.get(t.charAt(i));
                if(count<=0){
                    return false;
                }
                hm.put(t.charAt(i),count-1);
            } else {
                return false;
            }
        }
        return true;
        
    }
}

/*
Time Complexity : O(N)
*/