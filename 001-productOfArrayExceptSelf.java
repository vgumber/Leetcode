/*  QNO:238  Product of Array Except Self
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
*/


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int output = 1;
        int result[] = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = 1;
        }
        for (int i = 1; i < result.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];

        }
        for (int i = result.length - 2; i >= 0; i--) {
            output = output * nums[i + 1];
            result[i] = result[i] * output;
        }
        return result;
    }
}