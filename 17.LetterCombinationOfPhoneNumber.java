/*
17. Letter Combinations of a Phone Number
Medium
14.9K
841
Companies
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.


 

Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:

Input: digits = ""
Output: []
Example 3:

Input: digits = "2"
Output: ["a","b","c"]
 

Constraints:

0 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].*/

import java.util.ArrayList;
import java.util.List;
class Solution {
     private static final String[] mapping = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };
    
    public List<String> letterCombinations(String digits) {
      List<String> result = new ArrayList<>();
        if (digits.length() == 0)
            return result;
        
        generateCombinations(digits, 0, "", result);
        return result;
    }
    
    private void generateCombinations(String digits, int index, String current, List<String> result) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        
        char digit = digits.charAt(index);
        String letters = mapping[digit - '0'];
        for (char letter : letters.toCharArray()) {
            generateCombinations(digits, index + 1, current + letter, result);
        }
    }
}

   
