class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        // Also, any number ending with 0 that's not 0 itself is not a palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // Check if the first half is equal to the reversed second half
        // (or without the middle digit for odd-length numbers)
        return x == reversedHalf || x == reversedHalf / 10;
    }
}