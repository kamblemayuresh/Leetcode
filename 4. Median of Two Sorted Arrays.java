/*
4. Median of Two Sorted Arrays
Hard
23.4K
2.6K
Companies
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
*/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     double num3[]=new double[nums1.length+nums2.length];
     int i,j;
     for( i=0;i<nums1.length;i++){
         num3[i]=nums1[i];
     }
     for( j=0;j<nums2.length;j++){
         num3[i]=nums2[j];
         i++;
     }
        Arrays.sort(num3);
     if(num3.length%2==0){
         return (num3[num3.length/2-1]+num3[num3.length/2])/2;
     }
     else{
         return num3[num3.length/2];
     }
      
    }
   
    }


