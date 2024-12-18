package three_sum;
// Leetcode 15. 3Sum

// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// Notice that the solution set must not contain duplicate triplets.

 

// Example 1:

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation: 
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].
// Notice that the order of the output and the order of the triplets does not matter.


/* ========================================================================================= */

// Brute Force Approach (Time limit exceeds)

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class three_sum_brute {
       public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> result_set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(nums[i]+nums[j]+nums[k] == 0){

                        ArrayList<Integer> triplet = new ArrayList<>();

                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                         
                        triplet.sort(null); // null is used here as a comparator to sort ele in asc to desc

                        result_set.add(triplet);
                    }
                }
            }
        }

        return new ArrayList<>(result_set);
    }
}

