public class Solution {
    /**
     * @param s: a string which consists of lowercase or uppercase letters
     * @return: the length of the longest palindromes that can be built
     */
    public int longestPalindrome(String s) {
        // write your code here
        Set<Character> set = new HashSet<>();
        for (char c:s.toCharArray()){
            if (set.contains(c)){
                set.remove(c);
            }else{
                set.add(c);
            }
        }
        
        int remove = set.size();
        
        if (remove > 0){
            remove -= 1;
        }
        
        return s.length() - remove;
    }
}



public class Solution {
    /**
     * @param s: a string which consists of lowercase or uppercase letters
     * @return: the length of the longest palindromes that can be built
     */
    public int longestPalindrome(String s) {
        // write your code here
        int[] charStatArray = new int[52];
        int oneTimeOddCount = 0;
        int evenCount = 0;
        
        for(char ch : s.toCharArray()){
            if (ch >= 97){
                charStatArray[26 + ch - 'a'] ++;
            }
            else{
                charStatArray[ch - 'A'] ++;
            }
        }
        
        for(int cnt:charStatArray){
            if(cnt != 0){
                if(cnt % 2 == 0){
                    evenCount += cnt;
                }
                else{
                    if(cnt == 1){
                        oneTimeOddCount++;
                    }
                    else{
                        evenCount += cnt - 1;
                        oneTimeOddCount++;
                    }
                }
                
            }
        }
        
        return oneTimeOddCount>0? 1+evenCount:evenCount;
        
        
    }
}
